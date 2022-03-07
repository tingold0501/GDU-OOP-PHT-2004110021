package com.tinph2004110021.baitapbuoi7tailop;

public class NodeChuyenXe {
    private XeNgoaiThanh xeNgoaiThanh;
    private XeNoiThanh xeNoiThanh;
    private NodeChuyenXe next;
    public NodeChuyenXe(XeNgoaiThanh xeNgoaiThanh, XeNoiThanh xeNoiThanh, NodeChuyenXe next) {
        this.xeNgoaiThanh = xeNgoaiThanh;
        this.xeNoiThanh = xeNoiThanh;
        this.next = next;
    }
    public NodeChuyenXe(){

    }
    public NodeChuyenXe(XeNoiThanh xeNoiThanh){
        this.xeNoiThanh = xeNoiThanh;
        this.next = null;
    }
    public NodeChuyenXe(XeNgoaiThanh xeNgoaiThanh){
        this.xeNgoaiThanh = xeNgoaiThanh;
        this.next = null;
    }
    public NodeChuyenXe getNext() {
        return next;
    }
    public void setNext(NodeChuyenXe next) {
        this.next = next;
    }
    public XeNgoaiThanh getXeNgoaiThanh() {
        return xeNgoaiThanh;
    }
    public void setXeNgoaiThanh(XeNgoaiThanh xeNgoaiThanh) {
        this.xeNgoaiThanh = xeNgoaiThanh;
    }
    public XeNoiThanh getXeNoiThanh() {
        return xeNoiThanh;
    }
    public void setXeNoiThanh(XeNoiThanh xeNoiThanh) {
        this.xeNoiThanh = xeNoiThanh;
    }
    public NodeChuyenXe(XeNgoaiThanh xeNgoaiThanh, XeNoiThanh xeNoiThanh) {
        this.xeNgoaiThanh = xeNgoaiThanh;
        this.xeNoiThanh = xeNoiThanh;
    }
}
