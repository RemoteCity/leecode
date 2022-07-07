package com.whk.data.structures.list.structs;

import com.whk.data.structures.list.constants.MemoryAddress;
import com.whk.data.structures.list.constants.Status;

public interface SqListPtrUtils<T> {
    Status List_Init(SqListPtrUtils L);
    void List_Destory(SqListPtrUtils L);
    void List_Clear(SqListPtrUtils L);
    boolean List_Empty(SqListPtrUtils L);
    int List_Size(SqListPtrUtils L);
    Status List_Retrival(SqListPtrUtils L, int pos, MemoryAddress posAddress);
    Status List_Locate(SqListPtrUtils L, T elem, MemoryAddress posAddress);
    Status List_Insert(SqListPtrUtils L, int pos, T elem);
    Status List_delete(SqListPtrUtils L, int pos);
    Status List_Prior(SqListPtrUtils L, int pos, MemoryAddress posAddress);
    Status List_Next(SqListPtrUtils L, int pos, MemoryAddress posAddress);
}
