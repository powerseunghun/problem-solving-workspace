///* BEGIN_OF_SOURCE_CODE */
//
//#include <stdio.h>
//#include <string.h>
//
//#define min(a, b) ((a) < (b) ? (a) : (b))
//#define max(a, b) ((a) > (b) ? (a) : (b))
///* 대문자 <--> 소문자를 바꿔주는 매크로, '.' 문자는 그대로 둔다. */
//#define switch_case(c) ((c) == '.' ? '.' : ((c) <= 'z' ? ((c) + 'a' - 'A') : ((c) + 'A' - 'a')))
//
//char board[8][8];
//
///* 체스판 (배열 board)의 모든 말을 흑 <--> 백으로 색깔을 바꾸고, 판을 180도 돌려놓는다. */
//void turn_upside_down() {
//    int i, j;
//    char temp;
//    
//    for (i = 0; i < 4; i++) {
//        for (j = 0; j < 8; j++) {
//            temp = board[i][j];
//            board[i][j] = switch_case(board[7-i][7-j]);
//            board[7-i][7-j] = switch_case(temp);
//        }
//    }
//}
//
///* 위치 (istart, jstart) 에서 시작하여, 좌표에 각각 di, dj를 더하면서 
//해당 위치에 piece 라는 말이 있는지 검사한다. */
//int look_for_piece(char piece, int istart, int jstart, int di, int dj) {
//    int i = istart + di, j = jstart + dj;
//    
//    while (i >= 0 && i <= 7 && j >= 0 && j <= 7 && board[i][j] == '.') {
//        i += di;
//        j += dj;
//    }
//    return (i >= 0 && i <= 7 && j >= 0 && j <= 7 && board[i][j] == piece);
//}
//
///* 현재 배열 board를 보고 black king이 check 상태인지 검사한다. */
//int black_king_in_check() {
//    int i, j, iking, jking;
//    /* black king의 위치를 찾아 iking, jking에 저장한다. */
//    for (i = 0; i < 8; i++) {
//        for (j = 0; j < 8; j++) {
//            if (board[i][j] == 'k') {
//                iking = i;
//                jking = j;
//                break;
//            }
//        }
//    }
//    
//    /* pawns */
//    if (iking <= 6 && jking >= 1 && board[iking+1][jking-1] == 'p'
//    || iking <= 6 && jking <= 6 && board[iking+1][jking+1] == 'P') return 1;
//    
//    /* knights */
//    if (iking <= 6 && jking <= 5 && board[iking+1][jking+2] == 'N'
//    || iking <= 6 && jking >= 2 && board[iking+1][jking-2] == 'N'
//    || iking >= 1 && jking <= 5 && board[iking-1][jking+2] == 'N'
//    || iking >= 1 && jking >= 2 && board[iking-1][jking-2] == 'N'
//    || iking <= 5 && jking <= 6 && board[iking+2][jking+1] == 'N'
//    || iking <= 5 && jking >= 1 && board[iking+2][jking-1] == 'N'
//    || iking >= 2 && jking <= 6 && board[iking-2][jking+1] == 'N'
//    || iking >= 2 && jking >= 1 && board[iking-2][jking-1] == 'N') return 1;
//    
//    /* bishops */
//    if (look_for_piece('B', iking, jking, 1, 1)
//    || look_for_piece('B', iking, jking, 1, -1)
//    || look_for_piece('B', iking, jking, -1, 1)
//    || look_for_piece('B', iking, jking, -1, -1)) return 1;
//    
//    /* rooks */
//    if (look_for_piece('R', iking, jking, 1, 0)
//    || look_for_piece('R', iking, jking, -1, 0)
//    || look_for_piece('R', iking, jking, 0, 1)
//    || look_for_piece('R', iking, jking, 0, -1)) return 1;
//    
//    /* queen */
//    if (look_for_piece('Q', iking, jking, 1, 1)
//    || look_for_piece('Q', iking, jking, 1, -1)
//    || look_for_piece('Q', iking, jking, -1, 1)
//    || look_for_piece('Q', iking, jking, -1, -1)
//    || look_for_piece('Q', iking, jking, 1, 0)
//    || look_for_piece('Q', iking, jking, -1, 0)
//    || look_for_piece('Q', iking, jking, 0, 1)
//    || look_for_piece('Q', iking, jking, 0, -1)) return 1;
//    
//    /* king */
//    for (i = max(iking-1, 0); i <= min(iking+1, 7); i++) {
//        for (j = max(jking-1, 0); j <= min(jking+1, 7); j++) {
//            if (board[i][j] == 'K') return 1;
//        }
//    }
//    
//    /* 검사를 모두 통과했으므로 black king은 안전함 */
//    return 0;
//}
//
//void main(void) {
//    int empty_board;
//    int i, t;
//    
//    t = 0;
//    while (1) {
//        char tmp[0];
//        empty_board = 1;
//        for (i = 0; i < 8; i++) {
//            if (strcmp(fgets(board[i], sizeof(board[i])+2, stdin), "........")) empty_board = 0;
//        }
//        if (empty_board) break;
//        
//        printf("Game #%d: ", ++t);
//        /* black king 검사 */
//        if (black_king_in_check()) {
//            printf("black");
//        }
//        else {
//            turn_upside_down(); /* 체스판을 돌려놓고 */
//            /* white king 검사 */
//            if (black_king_in_check()) {
//                printf("white");
//            }
//            else printf("no");
//        }
//        printf(" king is in check.\n");
//        fgets(board[0], sizeof(board[0]), stdin); /* 입력에서 한 줄을 건너뜀 */
//    }
//}