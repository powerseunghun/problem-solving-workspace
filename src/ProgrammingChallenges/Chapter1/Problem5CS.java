///* @BEGIN_OF_SOURCE_CODE */
//
//#include <stdio.h>
//
//#define MAX_M_N 250
//
//static char bitmap[MAX_M_N + 1][MAX_M_N + 1];
//static int m = 0, n = 0;
//
///* (i, j) 위치에서 시작해서 color로 칠한다. */
//void fill(int i, int j, char org_color, char color) {
//    bitmap[i][j] = color;
//    
//    if (i > 1 && bitmap[i-1][j] == org_color) fill(i-1, j, org_color, color);
//    if (i < n && bitmap[i+1][j] == org_color) fill(i+1, j, org_color, color);
//    if (j > 1 && bitmap[i][j-1] == org_color) fill(i, j-1, org_color, color);
//    if (j < m && bitmap[i][j+1] == org_color) fill(i, j+1, org_color, color);
//}
//
//void main() {
//    int i, i1, i2, j, j1, j2, temp;
//    char command = '\0', color;
//    char filename[13];
//    
//    while (command != 'X') {
//        scanf("%c", &command);
//        switch(command) {
//            case 'I':
//                scanf("%d %d", &m, &n);
//            case 'C':
//                for (i = 1; i <= n; i++) {
//                    for (j = 1; j <= m; j++) {
//                        bitmap[i][j] = 'O';
//                    }
//                }
//                break;
//            case 'L':
//                scanf("%d %d %c", &j, &i, &color);
//                bitmap[i][j] = color;
//                break;
//            case 'V':
//                scanf("%d %d %d %c", &j, &i1, &i2, &color);
//                if (i1 > i2) {
//                    temp = i1; i1 = i2; i2 = temp;
//                }
//                for (i = i1; i <= i2; i++) {
//                    bitmap[i][j] = color;
//                }
//                break;
//            case 'H':
//                scanf("%d %d %d %c", &j1, &j2, &i, &color);
//                if (j1 > j2) {
//                    temp = j1; j1 = j2; j2 = temp;
//                }
//                for (j = j1; j <= j2; j++) {
//                    bitmap[i][j] = color;
//                }
//                break;
//            case 'K':
//                scanf("%d %d %d %d %c", &j1, &i1, &j2, &i2, &color);
//                for (i = i1; i <= i2; i++) {
//                    for (j = j1; j <= j2; j++) {
//                        bitmap[i][j] = color;
//                    }
//                }
//                break;
//            case 'F':
//                scanf("%d %d %c", &j, &i, &color);
//                fill(i, j, bitmap[i][j], color);
//                break;
//            case 'S':
//                scanf("%s", filename);
//                puts(filename);
//                for (i = 1; i <= n; i++) {
//                    for (j = 1; j <= m; j++) {
//                        putchar(bitmap[i][j]);
//                    }
//                    putchar('\n');
//                }
//                break;
//        }
//    }
//    /* @END_OF_SOURCE_CODE */
//}
