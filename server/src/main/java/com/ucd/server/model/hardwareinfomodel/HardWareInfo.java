package com.ucd.server.model.hardwareinfomodel;

import lombok.Data;

import java.util.Date;
@Data
public class HardWareInfo {
    private String id;

    private String host;

    private Double cpu;

    private Double vcpu;

    private Double memused;

    private Double memtotal;

    private Double memusedper;

    private String diskstatus;

    private String nip;

    private String intime;

    private Date creattime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    public Double getCpu() {
        return cpu;
    }

    public void setCpu(Double cpu) {
        this.cpu = cpu;
    }

    public Double getVcpu() {
        return vcpu;
    }

    public void setVcpu(Double vcpu) {
        this.vcpu = vcpu;
    }

    public Double getMemused() {
        return memused;
    }

    public void setMemused(Double memused) {
        this.memused = memused;
    }

    public Double getMemtotal() {
        return memtotal;
    }

    public void setMemtotal(Double memtotal) {
        this.memtotal = memtotal;
    }

    public Double getMemusedper() {
        return memusedper;
    }

    public void setMemusedper(Double memusedper) {
        this.memusedper = memusedper;
    }

    public String getDiskstatus() {
        return diskstatus;
    }

    public void setDiskstatus(String diskstatus) {
        this.diskstatus = diskstatus == null ? null : diskstatus.trim();
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip == null ? null : nip.trim();
    }

    public String getIntime() {
        return intime;
    }

    public void setIntime(String intime) {
        this.intime = intime == null ? null : intime.trim();
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }
}