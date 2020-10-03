import java.io.IOException;
import java.util.*;
public class queue {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		PriorityQueue<player> roster = new PriorityQueue<player>(11, new playerComparator());
		player player1 = new player("jeff","pandas",99, 64, 211, "pitcher");
		roster.add(player1);
		player player2 = new player("rob","sharks",1, 66, 270, "catcher");
		roster.add(player2);
		player player3 = new player("mike","snakes",37, 67, 201, "first base");
		roster.add(player3);
		player player4 = new player("anthony","bears",89, 69, 222, "second base");
		roster.add(player4);
		player player5 = new player("richard","bears",22, 71, 288, "third base");
		roster.add(player5);
		player player6 = new player("marcus","snakes",64, 42, 400, "right field");
		roster.add(player6);
		player player7 = new player("dave","sharks",71, 33, 100, "left field");
		roster.add(player7);
		player player8 = new player("ray","pandas",13, 96, 155, "center field");
		roster.add(player8);
		player player9 = new player("vaughn","lions",10, 17, 66, "shortstop");
		roster.add(player9);
		player player10 = new player("timothy","leopards",3, 54, 399, "designated hitter");
		roster.add(player10);
		
		System.out.println("Hello, Please pick one of the options \n");
		System.out.println("1. sort by jersey # ");
		System.out.println("2. sort by height");
		System.out.println("3. sort by weight");
		System.out.println("4. add an item of your choice: ");
		System.out.println("5. remove item by search: ");
		System.out.println("6. remove first item: ");
		System.out.println("7. display objects with contents: ");
		
		playerComparator compare = new playerComparator();
		
		Scanner keyboard = new Scanner(System.in);
		int userOption1 = keyboard.nextInt();
		
		switch (userOption1) {
		case 1:
			System.out.println("This will now sort by jersey #");
			int temp2;
			int r1 = player1.jerseyNumber;
			int r2 = player2.jerseyNumber;
			int r3 = player3.jerseyNumber;
			int r4 = player4.jerseyNumber;
			int r5 = player5.jerseyNumber;
			int r6 = player6.jerseyNumber;
			int r7 = player7.jerseyNumber;
			int r8 = player8.jerseyNumber;
			int r9 = player9.jerseyNumber;
			int r10 = player10.jerseyNumber;
			System.out.println("This will now sort by height");
		for (int number = 0; number < 9; number++) {
			if (r2 < r1) {
				temp2 = r1;
				r1 = r2;
				r2 = temp2;
			}
			if (r3 < r2) {
				temp2 = r2;
				r2 = r3;
				r3 = temp2;
			}
			if (r4 < r3) {
				temp2 = r3;
				r3 = r4;
				r4 = temp2;
			}
			if (r5 < r4) {
				temp2 = r4;
				r4 = r5;
				r5 = temp2;
			}
			if (r6 < r5) {
				temp2 = r5;
				r5 = r6;
				r6 = temp2;
			}
			if (r7 < r6) {
				temp2 = r6;
				r6 = r7;
				r7 = temp2;
			}
			if (r8 < r7) {
				temp2 = r7;
				r7 = r8;
				r8 = temp2;
			}
			if (r9 < r8) {
				temp2 = r8;
				r8 = r9;
				r9 = temp2;
			}
			if (r10 < r9) {
				temp2 = r9;
				r9 = r10;
				r10 = temp2;
			}
		}
		System.out.println("below is the heights in ascending order ");
		System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5  + " " +  r6  + " " + r7  + " " + r8  + " " +  r9  + " " + r10 + "\n");
		System.out.println("below is the heights in descending order ");
		System.out.println(r10 + " " + r9 + " " + r8 + " " + r7 + " " + r6 + " " + r5 + " " + r4 + " " + r3 + " " + r2 + " " + r1 + "\n");
			
			
			break;
		case 2:
			int temp;
			int p1 = player1.height;
			int p2 = player2.height;
			int p3 = player3.height;
			int p4 = player4.height;
			int p5 = player5.height;
			int p6 = player6.height;
			int p7 = player7.height;
			int p8 = player8.height;
			int p9 = player9.height;
			int p10 = player10.height;
			System.out.println("This will now sort by height");
		for (int number = 0; number < 9; number++) {
			if (p2 < p1) {
				temp = p1;
				p1 = p2;
				p2 = temp;
			}
			if (p3 < p2) {
				temp = p2;
				p2 = p3;
				p3 = temp;
			}
			if (p4 < p3) {
				temp = p3;
				p3 = p4;
				p4 = temp;
			}
			if (p5 < p4) {
				temp = p4;
				p4 = p5;
				p5 = temp;
			}
			if (p6 < p5) {
				temp = p5;
				p5 = p6;
				p6 = temp;
			}
			if (p7 < p6) {
				temp = p6;
				p6 = p7;
				p7 = temp;
			}
			if (p8 < p7) {
				temp = p7;
				p7 = p8;
				p8 = temp;
			}
			if (p9 < p8) {
				temp = p8;
				p8 = p9;
				p9 = temp;
			}
			if (p10 < p9) {
				temp = p9;
				p9 = p10;
				p10 = temp;
			}
		}
		System.out.println("below is the heights in ascending order ");
		System.out.println(p1 + " " + p2 + " " + p3 + " " + p4 + " " + p5  + " " +  p6  + " " + p7  + " " + p8  + " " +  p9  + " " + p10 + "\n");
		System.out.println("below is the heights in descending order ");
		System.out.println(p10 + " " + p9 + " " + p8 + " " + p7 + " " + p6 + " " + p5 + " " + p4 + " " + p3 + " " + p2 + " " + p1 + "\n");
			
			break;
		case 3:
			System.out.println("This will now sort by weight");
			int temp1;
			int q1 = player1.weight;
			int q2 = player2.weight;
			int q3 = player3.weight;
			int q4 = player4.weight;
			int q5 = player5.weight;
			int q6 = player6.weight;
			int q7 = player7.weight;
			int q8 = player8.weight;
			int q9 = player9.weight;
			int q10 = player10.weight;
			System.out.println("This will now sort by height");
		for (int number = 0; number < 9; number++) {
			if (q2 < q1) {
				temp1 = q1;
				q1 = q2;
				q2 = temp1;
			}
			if (q3 < q2) {
				temp1 = q2;
				q2 = q3;
				q3 = temp1;
			}
			if (q4 < q3) {
				temp1 = q3;
				q3 = q4;
				q4 = temp1;
			}
			if (q5 < q4) {
				temp1 = q4;
				q4 = q5;
				q5 = temp1;
			}
			if (q6 < q5) {
				temp1 = q5;
				q5 = q6;
				q6 = temp1;
			}
			if (q7 < q6) {
				temp1 = q6;
				q6 = q7;
				q7 = temp1;
			}
			if (q8 < q7) {
				temp1 = q7;
				q7 = q8;
				q8 = temp1;
			}
			if (q9 < q8) {
				temp1 = q8;
				q8 = q9;
				q9 = temp1;
			}
			if (q10 < q9) {
				temp1 = q9;
				q9 = q10;
				q10 = temp1;
			}
		}
		System.out.println("below is the weights in ascending order ");
		System.out.println(q1 + " " + q2 + " " + q3 + " " + q4 + " " + q5  + " " +  q6  + " " + q7  + " " + q8  + " " +  q9  + " " + q10 + "\n");
		System.out.println("below is the weights in descending order ");
		System.out.println(q10 + " " + q9 + " " + q8 + " " + q7 + " " + q6 + " " + q5 + " " + q4 + " " + q3 + " " + q2 + " " + q1 + "\n");
			
			
			break;
		case 4:
		System.out.println("Type out the name of the player");
		Scanner keyboard1 = new Scanner(System.in);
		String userPlayerName = keyboard1.next();
		System.out.println("Type out the team name");
		Scanner keyboard2 = new Scanner(System.in);
		String userTeamName = keyboard2.next();
		System.out.println("Type out the jersey number");
		Scanner keyboard3 = new Scanner(System.in);
		int userJerseyNumber = keyboard3.nextInt();
		System.out.println("Type out the height in inches");
		Scanner keyboard4 = new Scanner(System.in);
		int userHeight = keyboard4.nextInt();
		System.out.println("Type out the weight in weight");
		Scanner keyboard5 = new Scanner(System.in);
		int userWeight = keyboard5.nextInt();
		System.out.println("Type out the position of the player");
		Scanner keyboard6 = new Scanner(System.in);
		String userPosition = keyboard6.next();
		player player11 = new player(userPlayerName,userTeamName,userJerseyNumber,userHeight,userWeight,userPosition);
		roster.add(player11);
		System.out.println(player11.name.toString() + " " + player11.team.toString() + " " +  player11.jerseyNumber + " " + player11.height + " " + player11.weight + " " + player11.position.toString() + " is your new player \n");

			break;
		case 5:
		System.out.println("type the name of the player youd like to remove");
		Scanner playerRem = new Scanner(System.in);
		String removal = playerRem.next();
		if (removal.equals(player1.name)) {
			roster.remove(player1);
			System.out.println("player1 was removed");
		}
		if (removal.equals(player2.name)) {
			roster.remove(player2);
			System.out.println("player1 was removed");
		}
		if (removal.equals(player3.name)) {
			roster.remove(player3);
			System.out.println("player3 was removed");
		}
		if (removal.equals(player4.name)) {
			roster.remove(player4);
			System.out.println("player4 was removed");
		}
		if (removal.equals(player5.name)) {
			roster.remove(player5);
			System.out.println("player5 was removed");
		}
		if (removal.equals(player6.name)) {
			roster.remove(player6);
			System.out.println("player6 was removed");
		}
		if (removal.equals(player7.name)) {
			roster.remove(player7);
			System.out.println("player7 was removed");
		}
		if (removal.equals(player8.name)) {
			roster.remove(player8);
			System.out.println("player8 was removed");
		}
		if (removal.equals(player9.name)) {
			roster.remove(player9);
			System.out.println("player9 was removed");
		}
		if (removal.equals(player10.name)) {
			roster.remove(player10);
			System.out.println("player10 was removed");
		}
		System.out.println(player1.name.toString() + " " + player1.team.toString() + " " +  player1.jerseyNumber + " " + player1.height + " " + player1.weight + " " + player1.position.toString() + "\n");
		System.out.println(player2.name.toString() + " " + player2.team.toString() + " " +  player2.jerseyNumber + " " + player2.height + " " + player2.weight + " " + player2.position.toString() + "\n");
		System.out.println(player3.name.toString() + " " + player3.team.toString() + " " +  player3.jerseyNumber + " " + player3.height + " " + player3.weight + " " + player3.position.toString() + "\n");
		System.out.println(player4.name.toString() + " " + player4.team.toString() + " " +  player4.jerseyNumber + " " + player4.height + " " + player4.weight + " " + player4.position.toString() + "\n");
		System.out.println(player5.name.toString() + " " + player5.team.toString() + " " +  player5.jerseyNumber + " " + player5.height + " " + player5.weight + " " + player5.position.toString() + "\n");
		System.out.println(player6.name.toString() + " " + player6.team.toString() + " " +  player6.jerseyNumber + " " + player6.height + " " + player6.weight + " " + player6.position.toString() + "\n");
		System.out.println(player7.name.toString() + " " + player7.team.toString() + " " +  player7.jerseyNumber + " " + player7.height + " " + player7.weight + " " + player7.position.toString() + "\n");
		System.out.println(player8.name.toString() + " " + player8.team.toString() + " " +  player8.jerseyNumber + " " + player8.height + " " + player8.weight + " " + player8.position.toString() + "\n");
		System.out.println(player9.name.toString() + " " + player9.team.toString() + " " +  player9.jerseyNumber + " " + player9.height + " " + player9.weight + " " + player9.position.toString() + "\n");
		System.out.println(player10.name.toString() + " " + player10.team.toString() + " " +  player10.jerseyNumber + " " + player10.height + " " + player10.weight + " " + player10.position.toString() + "\n");
			break;
		case 6:
		roster.remove(player1);
		System.out.println("player1 was removed");

			break;
		case 7:
			
			System.out.println(player1.name.toString() + " " + player1.team.toString() + " " +  player1.jerseyNumber + " " + player1.height + " " + player1.weight + " " + player1.position.toString() + "\n");
			System.out.println(player2.name.toString() + " " + player2.team.toString() + " " +  player2.jerseyNumber + " " + player2.height + " " + player2.weight + " " + player2.position.toString() + "\n");
			System.out.println(player3.name.toString() + " " + player3.team.toString() + " " +  player3.jerseyNumber + " " + player3.height + " " + player3.weight + " " + player3.position.toString() + "\n");
			System.out.println(player4.name.toString() + " " + player4.team.toString() + " " +  player4.jerseyNumber + " " + player4.height + " " + player4.weight + " " + player4.position.toString() + "\n");
			System.out.println(player5.name.toString() + " " + player5.team.toString() + " " +  player5.jerseyNumber + " " + player5.height + " " + player5.weight + " " + player5.position.toString() + "\n");
			System.out.println(player6.name.toString() + " " + player6.team.toString() + " " +  player6.jerseyNumber + " " + player6.height + " " + player6.weight + " " + player6.position.toString() + "\n");
			System.out.println(player7.name.toString() + " " + player7.team.toString() + " " +  player7.jerseyNumber + " " + player7.height + " " + player7.weight + " " + player7.position.toString() + "\n");
			System.out.println(player8.name.toString() + " " + player8.team.toString() + " " +  player8.jerseyNumber + " " + player8.height + " " + player8.weight + " " + player8.position.toString() + "\n");
			System.out.println(player9.name.toString() + " " + player9.team.toString() + " " +  player9.jerseyNumber + " " + player9.height + " " + player9.weight + " " + player9.position.toString() + "\n");
			System.out.println(player10.name.toString() + " " + player10.team.toString() + " " +  player10.jerseyNumber + " " + player10.height + " " + player10.weight + " " + player10.position.toString() + "\n");

			break;
			
		}
		


		
		
		
		
	}
	
	
	
	

}

class playerComparator implements Comparator<player>{
	public int compare(player player1, player player2, player player3, player player4, player player5, player player6, player player7, player player8, player player9, player player10) {	
			
		
			return 0;
		
	}

	@Override
	public int compare(player o1, player o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
