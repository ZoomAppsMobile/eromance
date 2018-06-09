package com.zoomapps.eromance.Activities.auth

import android.app.DatePickerDialog
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TextInputLayout
import android.text.Editable
import android.text.InputType
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.*
import com.github.pinball83.maskededittext.MaskedEditText
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Activities.AuthActivity
import com.zoomapps.eromance.Activities.MainActivity
import com.zoomapps.eromance.Controllers.*
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Models.*
import com.zoomapps.eromance.R
import fr.ganfra.materialspinner.MaterialSpinner
import kotlinx.android.synthetic.main.activity_register_ob.*
import kotterknife.bindView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*
import java.text.SimpleDateFormat
import java.util.Collections.replaceAll
import com.zoomapps.eromance.R.string.before


class EditProfileActivity : AppCompatActivity(), TextWatcher {
    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

    }

    override fun afterTextChanged(s: Editable?) {

    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        var working = s.toString()
        var isValid = true
        if (working.length == 2 && before == 0) {
            if (Integer.parseInt(working) < 1 || Integer.parseInt(working) > 12) {
                isValid = false
            } else {
                working += "/"
                etDateOfBirth.setText(working)
                etDateOfBirth.setSelection(working.length)
            }
        } else if (working.length == 5 && before == 0) {
            working += "/"
            etDateOfBirth.setText(working)
            etDateOfBirth.setSelection(working.length)

        } else if (working.length == 11 && before == 0) {
            //etDateOfBirth.text.delete(working.length, -1)
            etDateOfBirth.setError("Введите валидную дату")
        }


//        else if (working.length == 7 && before == 0) {
//            val enteredYear = working.substring(3)
//            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
//            if (Integer.parseInt(enteredYear) < currentYear) {
//                isValid = false
//            }
//        } else if (working.length != 7) {
//            isValid = false
//        }
//
//        if (!isValid) {
//            etDateOfBirth.setError("Enter a valid date: MM/YYYY")
//        } else {
//            etDateOfBirth.setError(null)
//        }

    }

    val stCounty: MaterialSpinner by bindView(R.id.stCounty)
    val stCity: MaterialSpinner by bindView(R.id.stCity)
    val stDateOfBirth: TextInputLayout by bindView(R.id.stDateOfBirth)
    val etDateOfBirth: EditText by bindView(R.id.etDateOfBirth)
    val stNick: TextInputLayout by bindView(R.id.stNick)
    val etNick: EditText by bindView(R.id.etNick)
    val stSex: MaterialSpinner by bindView(R.id.stSex)
    val stLookFor: MaterialSpinner by bindView(R.id.stLookFor)
    val btn_continion: Button by bindView(R.id.btn_continion)
    var datePickerDialog: DatePickerDialog? = null
    val myCalendar = Calendar.getInstance();
    var date: DatePickerDialog.OnDateSetListener? = null
    var socialData: SocialDataModel? = null
    var is_Social: Boolean? = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)
        is_Social = intent.getBooleanExtra("isSocialCheck", false)
        if (is_Social!!) {
            var data = deSerializeToJson(intent.getStringExtra("socialData"), SocialDataModel::class.java);
            if (data == null)
                data = deSerializeToJson(intent.getExtras().getString("socialData"), SocialDataModel::class.java);
            if (data != null)
                socialData = data
        }











        API_Client.apiService!!.getListCities().enqueue(object : Callback<GetListCitiesModel>{
            override fun onFailure(call: Call<GetListCitiesModel>?, t: Throwable?) {

            }

            override fun onResponse(call: Call<GetListCitiesModel>?, response: Response<GetListCitiesModel>?) {
                var listCountries = response!!.body()
                val MutlistCities: MutableList<String> = mutableListOf()
                listCountries.data.forEach({ v->
                    MutlistCities.add(v.value)
                })
              var  adaptercity = ArrayAdapter(this@EditProfileActivity,android.R.layout.simple_spinner_dropdown_item,  MutlistCities)
                stCity.adapter = adaptercity

            }

        })

        stCity.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                if (position != -1) {
                    selectedCity = stCity.getItemAtPosition(position).toString()
                    Log.e("selectedCity", selectedCity)
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }
        }




        API_Client.apiService!!.getManAndWoman().enqueue(object : Callback<ManAndWoman>{
            override fun onFailure(call: Call<ManAndWoman>?, t: Throwable?) {

            }

            override fun onResponse(call: Call<ManAndWoman>?, response: Response<ManAndWoman>?) {
                var listCountries = response!!.body()
                val MutlistCities: MutableList<String> = mutableListOf()
                listCountries.data.forEach({ v->
                    MutlistCities.add(v.value)
                })
                var  adaptercity = ArrayAdapter(this@EditProfileActivity,android.R.layout.simple_spinner_dropdown_item,  MutlistCities)
                stLookFor.adapter = adaptercity

            }

        })

        stLookFor.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                if (position != -1) {
                    selectedLookingFor = stLookFor.getItemAtPosition(position).toString()
                    Log.e("selectedCity", selectedLookingFor)
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }
        }




        API_Client.apiService!!.getListCountries().enqueue(object : Callback<GetListCountriesModel>{
            override fun onFailure(call: Call<GetListCountriesModel>?, t: Throwable?) {

            }

            override fun onResponse(call: Call<GetListCountriesModel>?, response: Response<GetListCountriesModel>?) {
                var listCountries = response!!.body()
                val MutlistCountries: MutableList<String> = mutableListOf()
                listCountries.data.forEach({ v->
                    MutlistCountries.add(v.value)
                })
               var arrayMs_country = ArrayAdapter(this@EditProfileActivity,android.R.layout.simple_spinner_dropdown_item,MutlistCountries)
                stCounty.adapter = arrayMs_country
            }

        })


        stCounty.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                if (position != -1) {
                    // val selected = Integer.parseInt(stCounty.getItemAtPosition(position).toString())
                    selectedCountry = stCounty.getItemAtPosition(position).toString()
                    Log.e("selectedCountry", selectedCountry)
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }

        }



        API_Client.apiService!!.getManAndWoman().enqueue(object : Callback<ManAndWoman>{
            override fun onFailure(call: Call<ManAndWoman>?, t: Throwable?) {

            }

            override fun onResponse(call: Call<ManAndWoman>?, response: Response<ManAndWoman>?) {
                var listCountries = response!!.body()
                val MutlistCities: MutableList<String> = mutableListOf()
                listCountries.data.forEach({ v->
                    MutlistCities.add(v.value)
                })
                var  adaptercity = ArrayAdapter(this@EditProfileActivity,android.R.layout.simple_spinner_dropdown_item,  MutlistCities)
                stSex.adapter = adaptercity

            }

        })


        stSex.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                if (position != -1) {
                    selectedSex = stSex.getItemAtPosition(position).toString()
                    Log.e("selectedSex", selectedSex)
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }
        }


























        date = object : DatePickerDialog.OnDateSetListener {
            override fun onDateSet(view: DatePicker, year: Int, monthOfYear: Int,
                                   dayOfMonth: Int) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year)
                myCalendar.set(Calendar.MONTH, monthOfYear)
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                updateLabel()
            }
        }

        datePickerDialog = DatePickerDialog(this, date,
                myCalendar.get(Calendar.YEAR),
                myCalendar.get(Calendar.MONTH),
                myCalendar.get(Calendar.DAY_OF_MONTH))
        var dictionaryData = GlobalStaticVariables.allTranslations
//        init_spinners(getStrList(dictionaryData?.locationCountries!!) ,
        //     getStrList(dictionaryData?.locationCities!!) , getStrList(dictionaryData?.userProfileSexes!!));
        init_edittexts();
        btn_continion.setOnClickListener {
            if (!checkFields()) {
                showPreparedToast(this, "Fields")
            } else {
                val apiService = API_Client.client!!.create(API_Interface::class.java)
                val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                val formatted = sdf.format(myCalendar.getTime())
                val call = apiService.editProfile(
                        real_name = etNick.text.toString(),
                        born_at = formatted,
                        user_id = GlobalStaticVariables.myId.toString(),
                        sex_id = GlobalStaticVariables.allTranslations?.userProfileSexes?.firstOrNull { it -> it.value == selectedSex }?.id!!,
                        search_for = GlobalStaticVariables.allTranslations?.userProfileSexes?.firstOrNull { it -> it.value == selectedLookingFor }?.id!!,
                        country_id = GlobalStaticVariables.allTranslations?.locationCountries?.firstOrNull { it -> it.value == selectedCountry }?.id!!,
                        city_id = GlobalStaticVariables.allTranslations?.locationCities?.firstOrNull { it -> it.value == selectedCity }?.id!!,
                        language_id = 1,
                        weight = 0,
                        height = 0,
                        visability = 1
                )
                call.enqueue(object : Callback<UserProfileEditModel.UserProfileEditResponse> {
                    override fun onResponse(call: Call<UserProfileEditModel.UserProfileEditResponse>?, response: Response<UserProfileEditModel.UserProfileEditResponse>?) {

                        if (response!!.body() != null && response!!.errorBody() == null) {
                            if (response!!.body().data == null || response.body().code != 1) {
                                return
                            } else {
                                if (response.body().data != null) {
                                    //TODO:SUCCESS
                                    startActivity(Intent(this@EditProfileActivity, AuthActivity::class.java))
                                    showPreparedToast(this@EditProfileActivity, "Save")

                                    finish()
                                } else {

                                }
                            }
                        }
                    }

                    override fun onFailure(call: Call<UserProfileEditModel.UserProfileEditResponse>?, t: Throwable?) {

                    }

                })
            }
        }
        setSocialData()
    }

    fun setSocialData() {
        if (!is_Social!!)
            return
        if (!socialData?.username.isNullOrEmpty())
            etNick.setText(socialData?.username.toString());
        if (!socialData?.birthday_str.isNullOrEmpty())
            etDateOfBirth.setText(socialData?.birthday_str.toString())
        if (!socialData?.sex.isNullOrEmpty()) {
            var sex_id = socialData?.sex?.toInt()
            var sex_value = GlobalStaticVariables.allTranslations?.userProfileSexes!!.indexOfFirst { it -> it.id == sex_id }
            if (sex_value != null) {
                stSex.setSelection(sex_value)
                selectedSex = GlobalStaticVariables.allTranslations?.userProfileSexes!!.get(sex_value).value
            }
        }
    }

    fun checkFields(): Boolean {
        if (etNick.text.toString() == "" || etDateOfBirth.text.toString() == "" || myCalendar == null)
            return false
        if (selectedCity == "" || selectedCountry == "" || selectedLookingFor == "" || selectedSex == "")
            return false
        return true
    }

    fun updateLabel() {
        val myFormat = "MM/dd/yy" //In which you need put here
        val sdf = SimpleDateFormat(myFormat, Locale.CHINA)
        etDateOfBirth.setText(sdf.format(myCalendar.time))
    }

    fun init_edittexts() {
        etDateOfBirth.setOnClickListener {
            //  datePickerDialog!!.show();
        }

        etDateOfBirth.addTextChangedListener(this)


    }

    val list = listOf<Int>(0, 1, 2, 3, 4, 5)
    var selectedCountry: String? = ""
    var selectedCity: String? = ""
    var selectedSex: String? = ""
    var selectedLookingFor: String? = ""
    fun init_spinners(countryList: List<String>, cityList: List<String>, sexList: List<String>) {





        if (!selectedSex.isNullOrEmpty())
            stSex.setSelection(GlobalStaticVariables.allTranslations?.userProfileSexes?.indexOfFirst { it -> it.value == selectedSex }!!)



    }
}
