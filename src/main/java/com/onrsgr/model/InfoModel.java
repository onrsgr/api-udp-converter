package com.onrsgr.model;

public class InfoModel {

    String cmd;
    String packet;

    public InfoModel() {
    }

    public InfoModel(String cmd, String packet) {
        this.cmd = cmd;
        this.packet = packet;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public String getPacket() {
        return packet;
    }

    public void setPacket(String packet) {
        this.packet = packet;
    }

    @Override
    public String toString() {
        return "information{" +
                "cmd='" + cmd + '\'' +
                ", packet='" + packet + '\'' +
                '}';
    }
}
