package com.whk.data.structures.list.structs;

import com.whk.data.structures.list.constants.MemoryAddress;
import com.whk.data.structures.list.constants.Status;

/**
 * 1 线性表的定义
 * 线性表: n个同类型数据元素的有限序列,记为：
 * L= (a1，a2,...，ai,...，an)
 * L为表名；
 * i为数据元素ai 在线性表中的位序；
 * n为线性表的表长; n=0 时称为空表；
 * 数据元素之间的关系是：
 * ai-1领先于ai，ai领先于ai+1。
 * 称ai-1是ai的直接前驱，ai+1是ai的直接后继，
 * 除第一元素a1外，均有唯一的前驱；
 * 除最后元素an外，均有唯一的后继；
 */
public class SqListPrtUtilsImplUtils<T> implements SqListPtrUtils<T> {
    int index;
    int size;

    /**
     * 初始化一个线性表
     * @param L
     * @return
     */
    @Override
    public Status List_Init(SqListPtrUtils L) {

        return null;
    }

    /**
     * 销毁一个线程表
     * @param L
     */
    @Override
    public void List_Destory(SqListPtrUtils L) {

    }

    /**
     * 清空
     * @param L
     */
    @Override
    public void List_Clear(SqListPtrUtils L) {

    }

    /**
     * 判断线性表是否为空
     * @param L
     * @return
     */
    @Override
    public boolean List_Empty(SqListPtrUtils L) {
        return false;
    }

    @Override
    public int List_Size(SqListPtrUtils L) {
        return 0;
    }

    @Override
    public Status List_Retrival(SqListPtrUtils L, int pos, MemoryAddress posAddress) {
        return null;
    }

    /**
     * 取出改
     * @param L
     * @param pos
     * @return
     */
    public T List_Retrival(SqListPtrUtils L, int pos) {
        return null;
    }
    @Override
    public Status List_Locate(SqListPtrUtils L, T elem, MemoryAddress posAddress) {
        return null;
    }

    @Override
    public Status List_Insert(SqListPtrUtils L, int pos, T elem) {
        return null;
    }

    @Override
    public Status List_delete(SqListPtrUtils L, int pos) {
        return null;
    }

    @Override
    public Status List_Prior(SqListPtrUtils L, int pos, MemoryAddress posAddress) {
        return null;
    }

    @Override
    public Status List_Next(SqListPtrUtils L, int pos, MemoryAddress posAddress) {
        return null;
    }
}
