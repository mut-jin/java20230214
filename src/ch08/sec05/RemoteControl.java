package ch08.sec05;

public interface RemoteControl {
	// 상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	default void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	default void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	default void setVolume(int volume) {
		System.out.println("현재 TV 볼륨: " + volume);
	}
	
	// 디폴트 인스턴스 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
			// 추상 메소드 호출하면서 상수 필드 사용
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	static void changeBattery() {
		System.out.println("리모콘 건전지를 교환합니다.");
	}
}
