/*  PG基礎 課題１
 *
 */
package pg_ex01_2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PG_EX01_2 {

	public static void main(String[] args) throws IOException {
	// 変数定義
		int input_value;
		String output_string;
		String input_string;
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		// 変数初期化
		input_value = 0;
		output_string = "";
		// 入力されたアラビア数値をローマ数字大文字に変換
		while(true){
//			while(false){
				// アラビア数値を入力
				System.out.print("アラビア数値を入力してください" + " > ");
				input_string =  br.readLine();
//				public boolean isNumber(input_string)
//					try{
//						Integer.parseInt(input_string);
//						return true;
//					} catch (NumberFormatException e) {
//						return false;
//		}
//}
				input_value = Integer.parseInt(input_string);

			if (input_value <= 0 || input_value >= 21) {
				output_string = "変換できません";
			}else{
				if (input_value <= 10){
					if (input_value == 1){
						output_string = "I";
					}else if (input_value == 2){
						output_string = "II";
					}else if (input_value == 3){
						output_string = "III";
					}else if (input_value == 4){
						output_string = "IV";
					}else if (input_value == 5){
						output_string = "V";
					}else if (input_value == 6){
						output_string = "VI";
					}else if (input_value == 7){
						output_string = "VII";
					}else if (input_value == 8){
						output_string = "VIII";
					}else if (input_value == 9){
						output_string = "IX";
					}else if (input_value == 10){
						output_string = "X";
					}
				}else {
					if (input_value%10 == 1){
						output_string ="X" + "I";
					}else if (input_value%10 == 2){
						output_string = "II";
					}else if (input_value%10 == 3){
						output_string = "X" + "III";
					}else if (input_value%10 == 4){
						output_string = "X" + "IV";
					}else if (input_value%10 == 5){
						output_string = "X" + "V";
					}else if (input_value%10 == 6){
						output_string = "X" + "VI";
					}else if (input_value%10 == 7){
						output_string = "X" + "VII";
					}else if (input_value%10 == 8){
						output_string = "X" + "VIII";
					}else if (input_value%10 == 9){
						output_string = "X" + "IX";
					}else if (input_value%10 == 10){
						output_string = "X" + "X";
					}
				}
			}
			System.out.println("「" + input_value + "」" + "「" + output_string + "」");
			}
		}
	public static String KazuHenkan(int input_num) {
		if (input_num == 1){
			return "I";
		}else if(input_num == 2){
			return "II";
		}else if(input_num == 3){
			return "III";
		}else if(input_num == 4){
			return "IV";
		}else if(input_num == 5){
			return "V";
		}else if(input_num == 6){
			return "VI";
		}else if(input_num == 7){
			return "VII";
		}else if(input_num == 8){
			return "VIII";
		}else if(input_num == 9){
			return "IX";
		}else if(input_num == 10){
			return "X";
		}else if(input_num >10 && input_num <= 20){
			if(input_num%10 == 1){
				return "XI";
			}else if(input_num%10 == 2){
				return "XII";
			}else if(input_num%10 == 3){
				return "XIII";
			}else if(input_num%10 == 4){
				return "XIV";
			}else if(input_num%10 == 5){
				return "XV";
			}else if(input_num%10 == 6){
				return "XVI";
			}else if(input_num%10 == 7){
				return "XVII";
			}else if(input_num%10 == 8){
				return "XVIII";
			}else if(input_num%10 == 9){
				return "XIX";
			}
			else if(input_num%10 == 0);
				return "XX";
		}else{
			return "変換できません";
		}
		}
	}

