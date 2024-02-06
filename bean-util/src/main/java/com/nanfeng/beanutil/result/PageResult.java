package com.nanfeng.beanutil.result;

import java.io.Serializable;
import java.util.List;

public class PageResult<T> implements Serializable {
    private static final long serialVersionUID = 1L;


    private Long page;
    private Long size;
    private Long count;

    private List<T> list;

    public PageResult(){}
    public PageResult(Long page, Long size, List<T> list, Long count){
        this.setPage(page)
            .setSize(size)
            .setList(list)
            .setCount(count);
    }

    public static <T> PageResult result(Long page, Long size, List<T> list){

        return new PageResult(page,size,list,(long) list.size());
    }
    public static <T> PageResult result(Long page, Long size, List<T> list, Long count){

        return new PageResult(page,size,list,count);
    }
    public static <T> PageResult resultSqlList(Long page, Long size, List<List<T>> list){
        if (list == null || list.size()!=2) {
            throw new RuntimeException("init PageResult err, list is null or not support");
        }
        return new PageResult(page,size,list.get(0),(Long) list.get(1).get(0));
    }



    public Long getPage() {
        return page;
    }
    public PageResult setPage(Long page) {
        this.page = page;
        return this;
    }

    public Long getSize() {
        return size;
    }
    public PageResult setSize(Long size) {
        this.size = size;
        return this;
    }

    public Long getCount() {
        return count;
    }
    public PageResult setCount(Long count) {
        this.count = count;
        return this;
    }

    public List<T> getList() {
        return list;
    }
    public PageResult setList(List<T> list) {
        this.list = list;
        return this;
    }

}
