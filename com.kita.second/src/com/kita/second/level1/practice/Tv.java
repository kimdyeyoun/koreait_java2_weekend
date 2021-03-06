package com.kita.second.level1.practice;

import java.util.Scanner;

public class Tv {
	// 전원(isPoweron) 채널(channel) 볼륨(volume)
	//기본값 전원 false, 채널 1, 볼륨0
	//전원켜기(powerOn), 전원끄기(powerOff)
	//채널올리기(channelUp),채널내리기(channelDown)
	//볼륨높이기(volumnup),볼륨낮추기(volumnDown)
	//필드
	private boolean isPoweron;
	private int channel;
	private int volume;
	//생성자
	
	public Tv() {
		isPoweron = false;
		channel = 1;
		volume = 0;
	}
	Scanner sc = new Scanner(System.in);
	//메소드

	public void powerOn() {
		if (isPoweron) {
			System.out.println("전원이 이미 켜져있습니다.");
			return;
		}
		isPoweron = true;
		System.out.println("전원을 켭니다.");
	}
	
	public void powerOff() {
		if (!isPoweron) {
			System.out.println("전원이 이미 꺼져있습니다.");
			return;
		}
		isPoweron = false;
		System.out.println("전원을 끕니다.");
	}
	
	public void channelUp() {
		System.out.print("채널 +- :");
		String channel = sc.next();
		if (channel == "+") {
			System.out.println("채널을 올립니다");
		}
	}
		
	public void channelDown() {
		System.out.print("채널 +- :");
		String channel = sc.next();
		if (channel == "-") {
			System.out.println("채널을 내립니다.");
		}
	}
		
	public void volumnup() {
		System.out.print("볼륨 +/- :");
		String volum = sc.next();
		if (volum == "+") {
			System.out.println("볼륨을 높입니다.");
		}
	}
		
	public void volumnDown() {
			System.out.print("볼륨 +/- :");
			String volum = sc.next();
			if (volum == "-") {
				System.out.println("볼륨을 줄입니다.");
			}		
				
	}
}
