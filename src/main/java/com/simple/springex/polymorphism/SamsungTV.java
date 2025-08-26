package com.simple.springex.polymorphism;

import org.springframework.stereotype.Component;

@Component
public class SamsungTV  implements TV{
    String name;
    public SamsungTV() {
        System.out.println("SamsungTV~~~~");
    }

    public SamsungTV(String name) {
        System.out.println("SamsungTV~~~~");
    }

    public void powerOn() {
        System.out.println("SamsungTV---전원 켠다.");
    }
    public void powerOff() {
        System.out.println("SamsungTV---전원 끈다.");
    }
    public void volumeUp() {
        System.out.println("SamsungTV---소리 올린다.");
    }
    public void volumeDown() {
        System.out.println("SamsungTV---소리 내린다.");
    }

    // 삼성TV의 고유 기능은 추가 가능
}
