package com.zoomapps.eromance.Fragments;

import java.lang.System;

/**
 * * A simple [Fragment] subclass.
 * * Activities that contain this fragment must implement the
 * * [GameHistoryFragment.OnFragmentInteractionListener] interface
 * * to handle interaction events.
 * * Use the [GameHistoryFragment.newInstance] factory method to
 * * create an instance of this fragment.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 02\u00020\u0001:\u000201B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J&\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0006\u0010*\u001a\u00020!J\"\u0010+\u001a\u00020!2\u0010\u0010,\u001a\f\u0012\b\u0012\u00060\u0005R\u00020\u00060-2\b\b\u0002\u0010.\u001a\u00020/R$\u0010\u0003\u001a\f\u0012\b\u0012\u00060\u0005R\u00020\u00060\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u00062"}, d2 = {"Lcom/zoomapps/eromance/Fragments/GameHistoryFragment;", "Landroid/support/v4/app/Fragment;", "()V", "AdapterData", "Ljava/util/ArrayList;", "Lcom/zoomapps/eromance/Models/GameHistoryModel$Datum;", "Lcom/zoomapps/eromance/Models/GameHistoryModel;", "getAdapterData", "()Ljava/util/ArrayList;", "setAdapterData", "(Ljava/util/ArrayList;)V", "loader_container", "Landroid/widget/LinearLayout;", "getLoader_container", "()Landroid/widget/LinearLayout;", "setLoader_container", "(Landroid/widget/LinearLayout;)V", "mAdapter", "Landroid/support/v7/widget/RecyclerView$Adapter;", "getMAdapter", "()Landroid/support/v7/widget/RecyclerView$Adapter;", "setMAdapter", "(Landroid/support/v7/widget/RecyclerView$Adapter;)V", "mParam1", "", "mParam2", "main_RV", "Landroid/support/v7/widget/RecyclerView;", "getMain_RV", "()Landroid/support/v7/widget/RecyclerView;", "setMain_RV", "(Landroid/support/v7/widget/RecyclerView;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onLoadedStarted", "updateRV", "data", "", "clear", "", "Companion", "OnFragmentInteractionListener", "app_debug"})
public final class GameHistoryFragment extends android.support.v4.app.Fragment {
    private java.lang.String mParam1;
    private java.lang.String mParam2;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.zoomapps.eromance.Models.GameHistoryModel.Datum> AdapterData;
    @org.jetbrains.annotations.NotNull()
    public android.support.v7.widget.RecyclerView.Adapter<?> mAdapter;
    @org.jetbrains.annotations.NotNull()
    public android.support.v7.widget.RecyclerView main_RV;
    @org.jetbrains.annotations.NotNull()
    public android.widget.LinearLayout loader_container;
    private static final java.lang.String ARG_PARAM1 = "param1";
    private static final java.lang.String ARG_PARAM2 = "param2";
    public static final com.zoomapps.eromance.Fragments.GameHistoryFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public final void updateRV(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zoomapps.eromance.Models.GameHistoryModel.Datum> data, boolean clear) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.zoomapps.eromance.Models.GameHistoryModel.Datum> getAdapterData() {
        return null;
    }
    
    public final void setAdapterData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.zoomapps.eromance.Models.GameHistoryModel.Datum> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.widget.RecyclerView.Adapter<?> getMAdapter() {
        return null;
    }
    
    public final void setMAdapter(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView.Adapter<?> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.widget.RecyclerView getMain_RV() {
        return null;
    }
    
    public final void setMain_RV(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getLoader_container() {
        return null;
    }
    
    public final void setLoader_container(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout p0) {
    }
    
    public final void onLoadedStarted() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public GameHistoryFragment() {
        super();
    }
    
    /**
     * * This interface must be implemented by activities that contain this
     *     * fragment to allow an interaction in this fragment to be communicated
     *     * to the activity and potentially other fragments contained in that
     *     * activity.
     *     *
     *     *
     *     * See the Android Training lesson [Communicating with Other Fragments](http://developer.android.com/training/basics/fragments/communicating.html) for more information.
     */
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/zoomapps/eromance/Fragments/GameHistoryFragment$OnFragmentInteractionListener;", "", "onFragmentInteraction", "", "uri", "Landroid/net/Uri;", "app_debug"})
    public static abstract interface OnFragmentInteractionListener {
        
        public abstract void onFragmentInteraction(@org.jetbrains.annotations.NotNull()
        android.net.Uri uri);
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/zoomapps/eromance/Fragments/GameHistoryFragment$Companion;", "", "()V", "ARG_PARAM1", "", "getARG_PARAM1", "()Ljava/lang/String;", "ARG_PARAM2", "getARG_PARAM2", "newInstance", "Lcom/zoomapps/eromance/Fragments/GameHistoryFragment;", "param1", "param2", "app_debug"})
    public static final class Companion {
        
        private final java.lang.String getARG_PARAM1() {
            return null;
        }
        
        private final java.lang.String getARG_PARAM2() {
            return null;
        }
        
        /**
         * * Use this factory method to create a new instance of
         *         * this fragment using the provided parameters.
         *
         *         * @param param1 Parameter 1.
         *         * *
         *         * @param param2 Parameter 2.
         *         * *
         *         * @return A new instance of fragment GameHistoryFragment.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.zoomapps.eromance.Fragments.GameHistoryFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String param1, @org.jetbrains.annotations.NotNull()
        java.lang.String param2) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}