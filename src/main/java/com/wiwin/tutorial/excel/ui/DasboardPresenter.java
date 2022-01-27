package com.wiwin.tutorial.excel.ui;

public class DasboardPresenter {
    private static DasboardModel model = new DasboardModel();

    public DasboardPresenter() {

    }

    private static Action mAction = null;

    interface Action{
        public void onCount(int angka);
    }
    public  void setListener(Action listener){
        mAction = listener;
    }
}
