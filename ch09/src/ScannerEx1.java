import java.util.*;

public class ScannerEx1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] argArr = null;
		
		while(true) {
			String prompt = ">>";
			System.out.print(prompt);
			
			// ȭ�����κ��� ���� ������ �Է¹޴´�.
			String input = s.nextLine();
			
			input = input.trim();
			argArr = input.split(" +"); // " +" �ϳ� �̻��� ����
			
			String command = argArr[0].trim();
			
			if("".equals(command)) continue;
			
			// ��ɾ �ҹ��ڷ� �ٲ۴�.
			command = command.toLowerCase();
			
			// q �Ǵ� Q�� �Է��ϸ� ���� �����Ѵ�.
			if (command.equals("q")) {
				System.exit(0);
			} else {
				for (int i = 0; i<argArr.length; i++)
					System.out.println(argArr[i]);
			}
		} // while(true)
	} // main
}
// http://cafe.naver.com/javachobostudy/24687 �� Java100�� �Խ��� ����