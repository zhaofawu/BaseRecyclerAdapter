package com.example.ecrbtb.mvp.category.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.example.ecrbtb.mvp.category.adapter.CategoryTypeAdapter;

/**
 * Created by boby on 2016/12/15.
 */

public class Column2 implements MultiItemEntity {

    public String name;
    public int id;


    @Override
    public int getItemType() {
        return CategoryTypeAdapter.TYPE_COLUMN_2;
    }
}