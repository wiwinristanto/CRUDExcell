package com.wiwin.tutorial.excel.ui;

public class DasboardView implements DasboardPresenter.Action {
    private static DasboardPresenter presenter = new DasboardPresenter();

    public DasboardView(){
        setListener();
    }
    private void setListener(){
        presenter.setListener(this);
    }

    @Override
    public void onCount(int angka) {

    }
}
