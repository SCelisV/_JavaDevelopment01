package com.others;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * Realizar la suma de comprobación de un archivo, dado un BufferedReader abierto
 */

public class ChekSum {

	public static int process(BufferedReader is){

		int sum = 0;
		try{
			String inputLine;

			/*
			 * permite leer "fragmentos" de datos con el método readLine() de BufferedReader
			 * Lee caracter a caracter de un fichero y va sumando el valor ASCII de cada uno de ellos
			 */
			while ((inputLine = is.readLine()) != null){
				int i;
				for(i=0; i<inputLine.length(); i++){
					//System.out.println("i: " + i);
					//System.out.println("sum: " + sum);
					//System.out.println("inputLine.charAt(i): " + inputLine.charAt(i));
					sum += inputLine.charAt(i);
					//System.out.println("sum: " + sum);
				}
			}
			is.close();

		} catch (IOException e) {
			System.out.println("IOException: " + e);
		}
		return sum;
	}

	public static void printResults(FileReader fr, int chekSum){
		System.out.println("Input FileReader: " + fr); 		// Input FileReader: java.io.FileReader@2a139a55
		System.out.println("Output int: " + chekSum);  		// Output int: 12551
	}

	public static void main(String[] args) throws FileNotFoundException {
		FileReader fr = new FileReader("/home/hadoop/eclipse-workspace/javasrc-main/src/com/others/fileReader.txt");
		BufferedReader br = new BufferedReader(fr);    
		printResults(fr, process(br));
	}

}
/*
En este caso el fichero /home/hadoop/eclipse-workspace/javasrc-main/src/com/others/fileReader.txt contiene:
Este es un archivo que he creado para utilizar en la clase ChekSum.java para realizar una suma de comprobación del fichero, y/o ChekSum

i: 0
sum: 0
inputLine.charAt(i): E
sum: 69
i: 1
sum: 69
inputLine.charAt(i): s
sum: 184
i: 2
sum: 184
inputLine.charAt(i): t
sum: 300
i: 3
sum: 300
inputLine.charAt(i): e
sum: 401
i: 4
sum: 401
inputLine.charAt(i):  
sum: 433
i: 5
sum: 433
inputLine.charAt(i): e
sum: 534
i: 6
sum: 534
inputLine.charAt(i): s
sum: 649
i: 7
sum: 649
inputLine.charAt(i):  
sum: 681
i: 8
sum: 681
inputLine.charAt(i): u
sum: 798
i: 9
sum: 798
inputLine.charAt(i): n
sum: 908
i: 10
sum: 908
inputLine.charAt(i):  
sum: 940
i: 11
sum: 940
inputLine.charAt(i): a
sum: 1037
i: 12
sum: 1037
inputLine.charAt(i): r
sum: 1151
i: 13
sum: 1151
inputLine.charAt(i): c
sum: 1250
i: 14
sum: 1250
inputLine.charAt(i): h
sum: 1354
i: 15
sum: 1354
inputLine.charAt(i): i
sum: 1459
i: 16
sum: 1459
inputLine.charAt(i): v
sum: 1577
i: 17
sum: 1577
inputLine.charAt(i): o
sum: 1688
i: 18
sum: 1688
inputLine.charAt(i):  
sum: 1720
i: 19
sum: 1720
inputLine.charAt(i): q
sum: 1833
i: 20
sum: 1833
inputLine.charAt(i): u
sum: 1950
i: 21
sum: 1950
inputLine.charAt(i): e
sum: 2051
i: 22
sum: 2051
inputLine.charAt(i):  
sum: 2083
i: 23
sum: 2083
inputLine.charAt(i): h
sum: 2187
i: 24
sum: 2187
inputLine.charAt(i): e
sum: 2288
i: 25
sum: 2288
inputLine.charAt(i):  
sum: 2320
i: 26
sum: 2320
inputLine.charAt(i): c
sum: 2419
i: 27
sum: 2419
inputLine.charAt(i): r
sum: 2533
i: 28
sum: 2533
inputLine.charAt(i): e
sum: 2634
i: 29
sum: 2634
inputLine.charAt(i): a
sum: 2731
i: 30
sum: 2731
inputLine.charAt(i): d
sum: 2831
i: 31
sum: 2831
inputLine.charAt(i): o
sum: 2942
i: 32
sum: 2942
inputLine.charAt(i):  
sum: 2974
i: 33
sum: 2974
inputLine.charAt(i): p
sum: 3086
i: 34
sum: 3086
inputLine.charAt(i): a
sum: 3183
i: 35
sum: 3183
inputLine.charAt(i): r
sum: 3297
i: 36
sum: 3297
inputLine.charAt(i): a
sum: 3394
i: 37
sum: 3394
inputLine.charAt(i):  
sum: 3426
i: 38
sum: 3426
inputLine.charAt(i): u
sum: 3543
i: 39
sum: 3543
inputLine.charAt(i): t
sum: 3659
i: 40
sum: 3659
inputLine.charAt(i): i
sum: 3764
i: 41
sum: 3764
inputLine.charAt(i): l
sum: 3872
i: 42
sum: 3872
inputLine.charAt(i): i
sum: 3977
i: 43
sum: 3977
inputLine.charAt(i): z
sum: 4099
i: 44
sum: 4099
inputLine.charAt(i): a
sum: 4196
i: 45
sum: 4196
inputLine.charAt(i): r
sum: 4310
i: 46
sum: 4310
inputLine.charAt(i):  
sum: 4342
i: 47
sum: 4342
inputLine.charAt(i): e
sum: 4443
i: 48
sum: 4443
inputLine.charAt(i): n
sum: 4553
i: 49
sum: 4553
inputLine.charAt(i):  
sum: 4585
i: 50
sum: 4585
inputLine.charAt(i): l
sum: 4693
i: 51
sum: 4693
inputLine.charAt(i): a
sum: 4790
i: 52
sum: 4790
inputLine.charAt(i):  
sum: 4822
i: 53
sum: 4822
inputLine.charAt(i): c
sum: 4921
i: 54
sum: 4921
inputLine.charAt(i): l
sum: 5029
i: 55
sum: 5029
inputLine.charAt(i): a
sum: 5126
i: 56
sum: 5126
inputLine.charAt(i): s
sum: 5241
i: 57
sum: 5241
inputLine.charAt(i): e
sum: 5342
i: 58
sum: 5342
inputLine.charAt(i):  
sum: 5374
i: 59
sum: 5374
inputLine.charAt(i): C
sum: 5441
i: 60
sum: 5441
inputLine.charAt(i): h
sum: 5545
i: 61
sum: 5545
inputLine.charAt(i): e
sum: 5646
i: 62
sum: 5646
inputLine.charAt(i): k
sum: 5753
i: 63
sum: 5753
inputLine.charAt(i): S
sum: 5836
i: 64
sum: 5836
inputLine.charAt(i): u
sum: 5953
i: 65
sum: 5953
inputLine.charAt(i): m
sum: 6062
i: 66
sum: 6062
inputLine.charAt(i): .
sum: 6108
i: 67
sum: 6108
inputLine.charAt(i): j
sum: 6214
i: 68
sum: 6214
inputLine.charAt(i): a
sum: 6311
i: 69
sum: 6311
inputLine.charAt(i): v
sum: 6429
i: 70
sum: 6429
inputLine.charAt(i): a
sum: 6526
i: 71
sum: 6526
inputLine.charAt(i):  
sum: 6558
i: 72
sum: 6558
inputLine.charAt(i): p
sum: 6670
i: 73
sum: 6670
inputLine.charAt(i): a
sum: 6767
i: 74
sum: 6767
inputLine.charAt(i): r
sum: 6881
i: 75
sum: 6881
inputLine.charAt(i): a
sum: 6978
i: 76
sum: 6978
inputLine.charAt(i):  
sum: 7010
i: 77
sum: 7010
inputLine.charAt(i): r
sum: 7124
i: 78
sum: 7124
inputLine.charAt(i): e
sum: 7225
i: 79
sum: 7225
inputLine.charAt(i): a
sum: 7322
i: 80
sum: 7322
inputLine.charAt(i): l
sum: 7430
i: 81
sum: 7430
inputLine.charAt(i): i
sum: 7535
i: 82
sum: 7535
inputLine.charAt(i): z
sum: 7657
i: 83
sum: 7657
inputLine.charAt(i): a
sum: 7754
i: 84
sum: 7754
inputLine.charAt(i): r
sum: 7868
i: 85
sum: 7868
inputLine.charAt(i):  
sum: 7900
i: 86
sum: 7900
inputLine.charAt(i): u
sum: 8017
i: 87
sum: 8017
inputLine.charAt(i): n
sum: 8127
i: 88
sum: 8127
inputLine.charAt(i): a
sum: 8224
i: 89
sum: 8224
inputLine.charAt(i):  
sum: 8256
i: 90
sum: 8256
inputLine.charAt(i): s
sum: 8371
i: 91
sum: 8371
inputLine.charAt(i): u
sum: 8488
i: 92
sum: 8488
inputLine.charAt(i): m
sum: 8597
i: 93
sum: 8597
inputLine.charAt(i): a
sum: 8694
i: 94
sum: 8694
inputLine.charAt(i):  
sum: 8726
i: 95
sum: 8726
inputLine.charAt(i): d
sum: 8826
i: 96
sum: 8826
inputLine.charAt(i): e
sum: 8927
i: 97
sum: 8927
inputLine.charAt(i):  
sum: 8959
i: 98
sum: 8959
inputLine.charAt(i): c
sum: 9058
i: 99
sum: 9058
inputLine.charAt(i): o
sum: 9169
i: 100
sum: 9169
inputLine.charAt(i): m
sum: 9278
i: 101
sum: 9278
inputLine.charAt(i): p
sum: 9390
i: 102
sum: 9390
inputLine.charAt(i): r
sum: 9504
i: 103
sum: 9504
inputLine.charAt(i): o
sum: 9615
i: 104
sum: 9615
inputLine.charAt(i): b
sum: 9713
i: 105
sum: 9713
inputLine.charAt(i): a
sum: 9810
i: 106
sum: 9810
inputLine.charAt(i): c
sum: 9909
i: 107
sum: 9909
inputLine.charAt(i): i
sum: 10014
i: 108
sum: 10014
inputLine.charAt(i): ó
sum: 10257
i: 109
sum: 10257
inputLine.charAt(i): n
sum: 10367
i: 110
sum: 10367
inputLine.charAt(i):  
sum: 10399
i: 111
sum: 10399
inputLine.charAt(i): d
sum: 10499
i: 112
sum: 10499
inputLine.charAt(i): e
sum: 10600
i: 113
sum: 10600
inputLine.charAt(i): l
sum: 10708
i: 114
sum: 10708
inputLine.charAt(i):  
sum: 10740
i: 115
sum: 10740
inputLine.charAt(i): f
sum: 10842
i: 116
sum: 10842
inputLine.charAt(i): i
sum: 10947
i: 117
sum: 10947
inputLine.charAt(i): c
sum: 11046
i: 118
sum: 11046
inputLine.charAt(i): h
sum: 11150
i: 119
sum: 11150
inputLine.charAt(i): e
sum: 11251
i: 120
sum: 11251
inputLine.charAt(i): r
sum: 11365
i: 121
sum: 11365
inputLine.charAt(i): o
sum: 11476
i: 122
sum: 11476
inputLine.charAt(i): ,
sum: 11520
i: 123
sum: 11520
inputLine.charAt(i):  
sum: 11552
i: 124
sum: 11552
inputLine.charAt(i): y
sum: 11673
i: 125
sum: 11673
inputLine.charAt(i): /
sum: 11720
i: 126
sum: 11720
inputLine.charAt(i): o
sum: 11831
i: 127
sum: 11831
inputLine.charAt(i):  
sum: 11863
i: 128
sum: 11863
inputLine.charAt(i): C
sum: 11930
i: 129
sum: 11930
inputLine.charAt(i): h
sum: 12034
i: 130
sum: 12034
inputLine.charAt(i): e
sum: 12135
i: 131
sum: 12135
inputLine.charAt(i): k
sum: 12242
i: 132
sum: 12242
inputLine.charAt(i): S
sum: 12325
i: 133
sum: 12325
inputLine.charAt(i): u
sum: 12442
i: 134
sum: 12442
inputLine.charAt(i): m
sum: 12551

Input: java.io.FileReader@2a139a55
Output: 12551

*/
