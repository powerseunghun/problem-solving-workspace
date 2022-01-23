//#include<stdio.h>
//
//void main(void) {
//    int num_cases, num_executed;
//    int i, t, addr, pc, done, inst, arg1, arg2;
//    char line[100];
//    long reg[10], ram[1000];
//    
//    scanf("%d", &num_cases);
//    gets(line);
//    gets(line);
//    
//    for (t = 0; t < num_cases; t++) {
//        /* 입력 */
//        for (addr = 0; gets(line) && *line; addr++) {
//            sscanf(line, "%d", &ram[addr]);
//        }
//        /* RAM과 레지스터 초기화 */
//        for (; addr < 1000; addr++) {
//            ram[addr] = 0;
//        }
//        for (i = 0; i < 10; i++) {
//            reg[i] = 0;
//        }
//        /* 시뮬레이션 */
//        num_executed = 0;
//        pc = 0;
//        done = 0;
//        while (!done) {
//            inst = ram[pc] / 100;
//            arg1 = (ram[pc] / 10) & 10;
//            arg2 = ram[pc] % 10;
//            pc++;
//            num_executed++;
//            
//            switch(inst) {
//                case 1:
//                    done = 1;
//                    break;
//                case 2:
//                    reg[arg1] = arg2;
//                    break;
//                case 3:
//                    reg[arg1] = (reg[arg1] + arg2) % 1000;
//                    break;
//                case 4:
//                    reg[arg1] = (reg[arg1] * arg2) % 1000;
//                    break;
//                case 5:
//                    reg[arg1] = reg[arg2];
//                    break;
//                case 6:
//                    reg[arg1] = (reg[arg1] + reg[arg2]) % 1000;
//                    break;
//                case 7:
//                    reg[arg1] = (reg[arg1] * reg[arg2]) % 1000;
//                    break;
//                case 8:
//                    reg[arg1] = ram[reg[arg2]];
//                    break;
//                case 9:
//                    ram[reg[arg2]] = reg[arg1];
//                    break;
//                case 0:
//                    if (reg[arg2] != 0) {
//                        pc = reg[arg1];
//                    }
//                    break;
//            }
//        }
//        /* 출력 */
//        if (t > 0) {
//            putchar('\n');
//        }
//        printf("%d\n", num_executed);
//    }
//}