import java.util.*;
import java.util.concurrent.TimeUnit;

class Main {
	public static void main(String args[]) {
		System.out.println("Alarm Clock System has been activated. Current time: 00:00");
		Scanner sc = new Scanner(System.in);
		int state = 0;
		AlarmClock ac = new AlarmClock();
		
		while (true) {
			int value = -1;
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
					while (true) {
					System.out.println("Set Volume level: 1, 2 or 3: ");
					value = sc.nextInt();
						if (value > 0 && value < 4) {
							ac.setSoundLevel(value);
							break;
						}
						else continue;
					}
					if (!ac.getAlarmActive()) state = 0;
					else state = (ac.getActiveAlarmState()) ? 1 : 2;
				}
				break;
				case (6): {
					value = -1;
					while (true) {
						String s = ac.getActiveAlarmState(true);
						if (s == "radio") {
							while (true) {
								System.out.println("Radio Playing! RIIIDEE");
								try {TimeUnit.MILLISECONDS.sleep(700);} catch(InterruptedException e){System.out.println("WHY WON'T YOU LET ME SNOOZE");};
								System.out.println("INNNNNNNN");
								try {TimeUnit.MILLISECONDS.sleep(1000);} catch(InterruptedException e){System.out.println("WHY WON'T YOU LET ME SNOOZE");};
								System.out.println("TOOOOOOO");
								try {TimeUnit.MILLISECONDS.sleep(800);} catch(InterruptedException e){System.out.println("WHY WON'T YOU LET ME SNOOZE");};
								System.out.println("THHEE");
								try {TimeUnit.MILLISECONDS.sleep(700);} catch(InterruptedException e){System.out.println("WHY WON'T YOU LET ME SNOOZE");};
								System.out.print("DANGER ");
								try {TimeUnit.MILLISECONDS.sleep(400);} catch(InterruptedException e){System.out.println("WHY WON'T YOU LET ME SNOOZE");};
								System.out.println("ZONE!!!!!");
								try {TimeUnit.MILLISECONDS.sleep(1500);} catch(InterruptedException e){System.out.println("WHY WON'T YOU LET ME SNOOZE");};
								System.out.println("*guitar solo*");
								try {TimeUnit.MILLISECONDS.sleep(5000);} catch(InterruptedException e){System.out.println("WHY WON'T YOU LET ME SNOOZE");};
								System.out.println("Enter option: ");
								System.out.println("1: Snooze");
								System.out.println("2: Sleep");
								value = sc.nextInt();
								if (value == 1) {
									try {TimeUnit.SECONDS.sleep(1);} catch(InterruptedException e){System.out.println("WHY WON'T YOU LET ME SNOOZE");};
									System.out.println("1 mississippi......");
									try {TimeUnit.SECONDS.sleep(1);} catch(InterruptedException e){System.out.println("WHY WON'T YOU LET ME SNOOZE");};
									System.out.println("2 mississippi......");
									try {TimeUnit.SECONDS.sleep(1);} catch(InterruptedException e){System.out.println("WHY WON'T YOU LET ME SNOOZE");};
									System.out.println("3 mississippi......");
									try {TimeUnit.SECONDS.sleep(1);} catch(InterruptedException e){System.out.println("WHY WON'T YOU LET ME SNOOZE");};
									System.out.println("4 mississippi......");
									try {TimeUnit.SECONDS.sleep(1);} catch(InterruptedException e){System.out.println("WHY WON'T YOU LET ME SNOOZE");};
									System.out.println("5 mississippi......");
									try {TimeUnit.SECONDS.sleep(1);} catch(InterruptedException e){System.out.println("WHY WON'T YOU LET ME SNOOZE");};
									continue;
								}
								else if (value == 2) {
									break;
								}
							}
						}
						else if (s == "sound") {
							if (ac.getSoundLevel() != 3) {
								while (true) {
									int x = 0;
									while (x < 10) {
									try {TimeUnit.MILLISECONDS.sleep(300);} catch(InterruptedException e){System.out.println("WHY WON'T YOU LET ME SNOOZE");};
									System.out.print("ehh ");
									x++;
									}
									System.out.println();
									System.out.println("Press 1 to snooze, 2 to sleep, or 3 to 'let it ring'");
									value = sc.nextInt();
									if (value == 1) {
										for (int y = 0; y < 4; y++) {
											try{TimeUnit.SECONDS.sleep(1);}catch(InterruptedException e){;}
											System.out.println(3 - y + "....");
											}
										continue;
									}
									else if (value == 2) break;
									else if (value == 3) {
										while (x < 20) {
										try {TimeUnit.MILLISECONDS.sleep(300);} catch(InterruptedException e){System.out.println("WHY WON'T YOU LET ME SNOOZE");};
										System.out.print("EHH ");
										x++;
										}
									}
									break;
								}
									break;
							}
							else {
								while(true) {
								for (int t = 0; t < 11; t++) {
									try {TimeUnit.MILLISECONDS.sleep(300);} catch(InterruptedException e){System.out.println("WHY WON'T YOU LET ME SNOOZE");};
									System.out.print("EHH ");
									}
								System.out.println("");
								System.out.println("Press 1 to snooze or 2 to sleep");
								value = sc.nextInt();
								if (value == 1) {
									for (int x = 0; x < 3; x++) {
									try{TimeUnit.SECONDS.sleep(1);}catch(InterruptedException e){;}
									System.out.println(3 - x + "....");
									}
								}
								else if (value == 2) break;
								}
							}
						}
						break;
					}
					if (!ac.getAlarmActive()) state = 0;
					else state = (ac.getActiveAlarmState()) ? 1 : 2;
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
				System.out.println("5. Set Sound Volume");
				input = sc.nextInt();
			if (input > 0 && input < 6) {
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
				System.out.println("5. Set Sound Volume");
				System.out.println("6. Trigger Alarm");
				input = sc.nextInt();
			if (input >= 0 && input < 7 && input != 1 ) {
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
				System.out.println("5. Set Sound Volume");
				System.out.println("6. Trigger Alarm");
				try {input = sc.nextInt();} catch(InputMismatchException e){System.out.println("Enter a number from 0-6, idiot");}
			if (input >= 0 && input < 7 && input != 2) {
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