package com.zoomapps.eromance.Fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0003J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\u0006\u0010\u0017\u001a\u00020\u0018J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0006\u0010(\u001a\u00020\u0018R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/zoomapps/eromance/Fragments/FilterDialogFragment;", "Landroid/support/v4/app/DialogFragment;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "()V", "cancel_btn", "Landroid/widget/Button;", "mTopFilterAdapter", "Landroid/support/v7/widget/RecyclerView$Adapter;", "getMTopFilterAdapter", "()Landroid/support/v7/widget/RecyclerView$Adapter;", "setMTopFilterAdapter", "(Landroid/support/v7/widget/RecyclerView$Adapter;)V", "mTopFilterLayoutManager", "Landroid/support/v7/widget/GridLayoutManager;", "men_CB", "Landroid/widget/CheckBox;", "send_btn", "top_filter_RV", "Landroid/support/v7/widget/RecyclerView;", "woman_CB", "filterList", "", "Lcom/zoomapps/eromance/Models/MapsModels$FilterItems;", "init_top_filter_view", "", "onCheckedChanged", "p0", "Landroid/widget/CompoundButton;", "p1", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setCheckedSex", "Companion", "app_debug"})
public final class FilterDialogFragment extends android.support.v4.app.DialogFragment implements android.widget.CompoundButton.OnCheckedChangeListener {
    private android.widget.CheckBox men_CB;
    private android.widget.CheckBox woman_CB;
    private android.support.v7.widget.RecyclerView top_filter_RV;
    private android.widget.Button send_btn;
    private android.widget.Button cancel_btn;
    @org.jetbrains.annotations.Nullable()
    private android.support.v7.widget.RecyclerView.Adapter<?> mTopFilterAdapter;
    private android.support.v7.widget.GridLayoutManager mTopFilterLayoutManager;
    public static final com.zoomapps.eromance.Fragments.FilterDialogFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onCheckedChanged(@org.jetbrains.annotations.Nullable()
    android.widget.CompoundButton p0, boolean p1) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void setCheckedSex() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.support.v7.widget.RecyclerView.Adapter<?> getMTopFilterAdapter() {
        return null;
    }
    
    public final void setMTopFilterAdapter(@org.jetbrains.annotations.Nullable()
    android.support.v7.widget.RecyclerView.Adapter<?> p0) {
    }
    
    public final void init_top_filter_view() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.zoomapps.eromance.Models.MapsModels.FilterItems> filterList() {
        return null;
    }
    
    public FilterDialogFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/zoomapps/eromance/Fragments/FilterDialogFragment$Companion;", "", "()V", "newInstance", "Lcom/zoomapps/eromance/Fragments/FilterDialogFragment;", "title", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.zoomapps.eromance.Fragments.FilterDialogFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String title) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}