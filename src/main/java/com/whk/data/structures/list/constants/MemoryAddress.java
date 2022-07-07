package com.whk.data.structures.list.constants;

public class MemoryAddress {
    int hashAddress;

    private MemoryAddress(int hashAddress) {
        this.hashAddress = hashAddress;
    }
    public static MemoryAddress newMemoryAddress(int hashAddress){
        return new MemoryAddress(hashAddress);
    }
}
