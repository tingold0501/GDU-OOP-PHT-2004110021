package com.tinph2004110021.baitapbuoi7tailop;

public class LinkedListChuyenXe {
    private NodeChuyenXe tail, head;
    CompanyTravelV companyTravelV = new CompanyTravelV();
    public LinkedListChuyenXe(){
        this.head = null;
        this.tail = null;
    }
    public boolean isEmpty()
    {
        return this.head == null;
    }
    public void themChuyenXeNoiThanh(XeNoiThanh xeNoiThanh){
        if(isEmpty()){
            this.head = this.tail = new NodeChuyenXe(xeNoiThanh);
            return;
        }
        NodeChuyenXe newNodeChuyenXe = new NodeChuyenXe(xeNoiThanh);
        this.tail.setNext(newNodeChuyenXe);
        this.tail = newNodeChuyenXe;
    }
    public void themChuyenXeNgoaiThanh(XeNgoaiThanh xeNgoaiThanh){
        if(isEmpty()){
            this.head = this.tail = new NodeChuyenXe(xeNgoaiThanh);
            return;
        }
        NodeChuyenXe newNodeChuyenXe = new NodeChuyenXe(xeNgoaiThanh);
        this.tail.setNext(newNodeChuyenXe);
        this.tail = newNodeChuyenXe;
    }
}
