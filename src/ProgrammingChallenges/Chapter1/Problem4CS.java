// c language source

//#include <stdio.h>
//#include <string.h>
//
//#define MAX_S 10
//#define MAX_DIGITS 8
//
//void main()
//{
//    int s, i, j, digit, num_digits;
//    char number[MAX_DIGITS+1];
//    char hor_bar[2][MAX_S+1] = {"          ", "----------"};
//    char ver_bar[2][2] = {" ", "|"};
//    char hor[10][3] = {{1,0,1},{0,0,0},{1,1,1},{1,1,1},{0,1,0},{1,1,1},{1,1,1},{1,0,0},{1,1,1},{1,1,1}};
//    char ver[10][4] = {{1,1,1,1},{0,1,0,1},{0,1,1,0},{0,1,0,1},{1,1,0,1},{1,0,0,1},{1,0,1,1},{0,1,0,1},{1,1,1,1},{1,1,0,1}};
//    char result[5][(MAX_S + 3) * MAX_DIGITS];
//    scanf("%d", &s);
//    while (s != 0) {
//        for (i = 0; i < 5; i++) {
//            result[i][0] = '\0';
//        }
//        
//        hor_bar[0][s] = '\0';
//        hor_bar[1][s] = '\0';
//        scanf("%s", number);
//        
//        num_digits = strlen(number);
//        for (i = 0; i < num_digits; i++) {
//            digit = number[i] - '0';
//            if (i > 0) {
//                for (j = 0; j < 5; j++) {
//                    strcat(result[j], " ");
//                }
//            }
//            strcat(result[0], " ");
//            strcat(result[0], hor_bar[hor[digit][0]]);
//            strcat(result[0], " ");
//            
//            strcat(result[1], ver_bar[ver[digit][0]]);
//            strcat(result[1], hor_bar[0]);
//            strcat(result[1], ver_bar[ver[digit][1]]);
//            
//            strcat(result[2], " ");
//            strcat(result[2], hor_bar[hor[digit][1]]);
//            strcat(result[2], " ");
//            
//            strcat(result[3], ver_bar[ver[digit][2]]);
//            strcat(result[3], hor_bar[0]);
//            strcat(result[3], ver_bar[ver[digit][3]]);
//            
//            strcat(result[4], " ");
//            strcat(result[4], hor_bar[hor[digit][2]]);
//            strcat(result[4], " ");
//        }
//        puts(result[0]);
//        for (i = 0; i < s; i++) {
//            puts(result[1]);
//        }
//        puts(result[2]);
//        for (i = 0; i < s; i++) {
//            puts(result[3]);
//        }
//        puts(result[4]);
//        putchar('\n');
//        
//        hor_bar[0][s] = ' ';
//        hor_bar[1][s] = '-';
//        scanf("%d", &s);
//    }
//}
