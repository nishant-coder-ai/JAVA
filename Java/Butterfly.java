import java.util.*;


class Butterfly{
	public static void main(String args[]){
		System.out.println("Enter the Number of Rows : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int flag = n;
		for(int i = 1; i <= n; i++){
			// for Stars
			for(int j = 1; j <= i; j++){
				System.out.print(" * ");
			}

			// for Spaces
			for(int j = ((flag * 2) - 2); j >= 1; j--){
				System.out.print("   ");
			}

			flag--;

			// for Stars
			for(int j = 1; j <= i; j++){
				System.out.print(" * ");
			}
			System.out.println();
		}

		int flag1 = 0;
		for(int i = n; i >= 1; i--){
			// for Stars
			for(int j = 1; j <= i; j++){
				System.out.print(" * ");
			}

			// for Spaces
			for(int j = 1; j <= (((i+flag1)*2)-(i*2)); j++){
				System.out.print("   ");
			}

			flag1++;

			// for Stars
			for(int j = 1; j <= i; j++){
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}

/*

Microsoft Windows [Version 10.0.19044.1586]
(c) Microsoft Corporation. All rights reserved.

D:\Java>javac Butterfly.java

D:\Java>java Butterfly
Enter the Number of Rows :
5
 *                          *
 *  *                    *  *
 *  *  *              *  *  *
 *  *  *  *        *  *  *  *
 *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *
 *  *  *  *        *  *  *  *
 *  *  *              *  *  *
 *  *                    *  *
 *                          *

D:\Java>java Butterfly
Enter the Number of Rows :
10
 *                                                        *
 *  *                                                  *  *
 *  *  *                                            *  *  *
 *  *  *  *                                      *  *  *  *
 *  *  *  *  *                                *  *  *  *  *
 *  *  *  *  *  *                          *  *  *  *  *  *
 *  *  *  *  *  *  *                    *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *              *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *        *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *        *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *              *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *                    *  *  *  *  *  *  *
 *  *  *  *  *  *                          *  *  *  *  *  *
 *  *  *  *  *                                *  *  *  *  *
 *  *  *  *                                      *  *  *  *
 *  *  *                                            *  *  *
 *  *                                                  *  *
 *                                                        *

D:\Java>java Butterfly
Enter the Number of Rows :
15
 *                                                                                      *
 *  *                                                                                *  *
 *  *  *                                                                          *  *  *
 *  *  *  *                                                                    *  *  *  *
 *  *  *  *  *                                                              *  *  *  *  *
 *  *  *  *  *  *                                                        *  *  *  *  *  *
 *  *  *  *  *  *  *                                                  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *                                            *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *                                      *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *                                *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *                          *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *                    *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *              *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *        *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *        *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *              *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *                    *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *                          *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *                                *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *                                      *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *                                            *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *                                                  *  *  *  *  *  *  *
 *  *  *  *  *  *                                                        *  *  *  *  *  *
 *  *  *  *  *                                                              *  *  *  *  *
 *  *  *  *                                                                    *  *  *  *
 *  *  *                                                                          *  *  *
 *  *                                                                                *  *
 *                                                                                      *

D:\Java>java Butterfly
Enter the Number of Rows :
20
 *                                                                                                                    *
 *  *                                                                                                              *  *
 *  *  *                                                                                                        *  *  *
 *  *  *  *                                                                                                  *  *  *  *
 *  *  *  *  *                                                                                            *  *  *  *  *
 *  *  *  *  *  *                                                                                      *  *  *  *  *  *
 *  *  *  *  *  *  *                                                                                *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *                                                                          *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *                                                                    *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *                                                              *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *                                                        *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *                                                  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *                                            *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *                                      *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *                                *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *                          *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *                    *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *              *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *        *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *        *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *              *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *                    *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *                          *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *                                *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *                                      *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *                                            *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *                                                  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *                                                        *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *                                                              *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *                                                                    *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *                                                                          *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *                                                                                *  *  *  *  *  *  *
 *  *  *  *  *  *                                                                                      *  *  *  *  *  *
 *  *  *  *  *                                                                                            *  *  *  *  *
 *  *  *  *                                                                                                  *  *  *  *
 *  *  *                                                                                                        *  *  *
 *  *                                                                                                              *  *
 *                                                                                                                    *

D:\Java>java Butterfly
Enter the Number of Rows :
25
 *                                                                                                                                                  *
 *  *                                                                                                                                            *  *
 *  *  *                                                                                                                                      *  *  *
 *  *  *  *                                                                                                                                *  *  *  *
 *  *  *  *  *                                                                                                                          *  *  *  *  *
 *  *  *  *  *  *                                                                                                                    *  *  *  *  *  *
 *  *  *  *  *  *  *                                                                                                              *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *                                                                                                        *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *                                                                                                  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *                                                                                            *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *                                                                                      *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *                                                                                *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *                                                                          *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *                                                                    *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *                                                              *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *                                                        *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *                                                  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *                                            *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *                                      *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *                                *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *                          *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *                    *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *              *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *        *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *        *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *              *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *                    *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *                          *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *                                *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *                                      *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *                                            *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *                                                  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *                                                        *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *                                                              *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *  *                                                                    *  *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *  *                                                                          *  *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *  *                                                                                *  *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *  *                                                                                      *  *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *                                                                                            *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *                                                                                                  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *                                                                                                        *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *                                                                                                              *  *  *  *  *  *  *
 *  *  *  *  *  *                                                                                                                    *  *  *  *  *  *
 *  *  *  *  *                                                                                                                          *  *  *  *  *
 *  *  *  *                                                                                                                                *  *  *  *
 *  *  *                                                                                                                                      *  *  *
 *  *                                                                                                                                            *  *
 *                                                                                                                                                  *

D:\Java>

*/