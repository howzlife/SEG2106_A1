import java.util.*;

class Main {
	public static void main(String args[]) {
		System.out.println("Alarm Clock System has been activated. Current time: 00:00");
		Scanner sc = new Scanner(System.in);
		int state = 0, newState;
		AlarmClock ac = new AlarmClock();
		
		while (true) {
			int value;
			state = currentOptions(state);
			switch(state) {
				case (0): {
					ac.deActivateAlarm();
					System.out.println("Alarm is no longer active");	
				}
				break;
				case (1): {
					ac.activateAlarm(0);
					System.out.println("Radio Alarm is now active");	
				}
				break;
				case (2): {
					ac.activateAlarm(1);
					System.out.println("Sound Alarm is now active");	
				}
				break;
				case (3): {
					while (true) {
					System.out.println("Current Alarm Time is: " + getAlarmTime(ac));
					System.out.println("Options: ");
					System.out.println("1. Increment hours by 1");
					System.out.println("2. Increment Minutes by 10");
					System.out.println("3. Increment Minutes by 1");
					System.out.println("4. Finish Setting Time");
					value = sc.nextInt();
					if (value == 1) ac.incrementAlarmHour();
					else if (value == 2) ac.incrementAlarmMinute(10);
					else if (value == 3) ac.incrementAlarmMinute(1);
					else if (value == 4) break;
					}
					if (!ac.getAlarmActive()) state = 0;
					else state = (ac.getActiveAlarmState()) ? 1 : 2;
					}
				break;
				case (4): {
					while (true) {
					System.out.println("Current Time is: " + getCurrentTime(ac));
					System.out.println("Options: ");
					System.out.println("1. Increment hours by 1");
					System.out.println("2. Increment Minutes by 10");
					System.out.println("3. Increment Minutes by 1");
					System.out.println("4. Finish Setting Time");
					value = sc.nextInt();
					if (value == 1) ac.incrementCurrentHour();
					else if (value == 2) ac.incrementCurrentMinutes(10);
					else if (value == 3) ac.incrementCurrentMinutes(1);
					else if (value == 4) break;
					}
					if (!ac.getAlarmActive()) state = 0;
					else state = (ac.getActiveAlarmState()) ? 1 : 2;
					}
				break;
				case (5): {
					
					state = (ac.getActiveAlarmState()) ? 1 : 2;
				}
				break;
			}	
		System.out.println("Current time is: " + getCurrentTime(ac));
		System.out.println("Current alarm time is: " + getAlarmTime(ac));
		if (ac.getAlarmActive()) System.out.println("Alarm is active"); else System.out.println("Alarm is inactive");
		}
	}
	
	public static int currentOptions(int stateID) {
		Scanner sc = new Scanner(System.in);
		int input = -1;
		switch (stateID) {
		case 0: 
			while (true) {
				System.out.println("Current Options (please input number): ");
				System.out.println("1. Activate Radio Alarm ");
				System.out.println("2. Activate Sound Alarm ");
				System.out.println("3. Set Alarm Time");
				System.out.println("4. Set Current Time");
				input = sc.nextInt();
			if (input > 0 && input < 5) {
				break;
			}
			}
			break;
		case 1: 
			while (true) {
				System.out.println("Current Options (please input number): ");
				System.out.println("0. De-Activate Alarm");
				System.out.println("2. Activate Sound Alarm ");
				System.out.println("3. Set Alarm Time");
				System.out.println("4. Set Current Time");
				System.out.println("5. Trigger Alarm");
				input = sc.nextInt();
			if (input >= 0 && input < 6 && input != 1) {
				break;
			}
			}
			break;
		case 2: 
			while (true) {
				System.out.println("Current Options (please input number): ");
				System.out.println("0. De-Activate Alarm");
				System.out.println("1. Activate Radio Alarm ");
				System.out.println("3. Set Alarm Time");
				System.out.println("4. Set Current Time");
				System.out.println("5. Trigger Alarm");
				input = sc.nextInt();
			if (input >= 0 && input < 6 && input != 2) {
				break;
			}
			}
			break;
		}
		
		return input;
	}
	public static String getAlarmTime(AlarmClock ac) {
		String h, m;
		if (ac.getAlarmHour() < 10) h = "0"+Integer.toString(ac.getAlarmHour()); else h = Integer.toString(ac.getAlarmHour());
		if (ac.getAlarmMinutes() < 10) m = "0" + Integer.toString(ac.getAlarmMinutes()); else m = Integer.toString(ac.getAlarmMinutes());
		return h + ":" + m;
	}
	
	public static String getCurrentTime(AlarmClock ac) {
		String h, m;
		if (ac.getCurrentHour() < 10) h = "0"+Integer.toString(ac.getCurrentHour()); else h = Integer.toString(ac.getCurrentHour());
		if (ac.getCurrentMinutes() < 10) m = "0" + Integer.toString(ac.getCurrentMinutes()); else m = Integer.toString(ac.getCurrentMinutes());
		return h + ":" + m;
	}
}