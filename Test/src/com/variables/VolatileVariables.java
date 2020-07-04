package com.variables;

import java.util.concurrent.TimeUnit;

/*-
 * 
 * @author lokeshwar @created June 18, 2020
 *
    --------------------------------------------------------------------------------------------------------
    VISIBILITY PROBLEM
    --------------------------------------------------------------------------------------------------------
    http://tutorials.jenkov.com/java-concurrency/volatile.html
    -------------------------------------------------------------------------------------------------------- 
      * The Java volatile keyword is used to mark a Java variable as "being stored in main memory". 
      * i.e. every read of a volatile variable will be read from the computer's main memory, and not from the CPU cache, 
      * and that every write to a volatile variable will be written to main memory, and not just to the CPU cache.
    --------------------------------------------------------------------------------------------------------  
      * If two threads are both reading and writing to a shared variable, then using the volatile keyword for that is not enough. 
      * You need to use a synchronized in that case to guarantee that the reading and writing of the variable is atomic. 
      * Reading or writing a volatile variable does not block threads reading or writing. 
      * For this to happen you must use the synchronized keyword around critical sections.
    --------------------------------------------------------------------------------------------------------
      * As an alternative to a synchronized block you could also use one of the many atomic data types found in the java.util.concurrent package. 
      * For instance, the AtomicLong or AtomicReference or one of the others.
    --------------------------------------------------------------------------------------------------------
      * In case only one thread reads and writes the value of a volatile variable and other threads only read the variable, 
      * then the reading threads are guaranteed to see the latest value written to the volatile variable. 
      * Without making the variable volatile, this would not be guaranteed.
      * The volatile keyword is guaranteed to work on 32 bit and 64 variables.
     --------------------------------------------------------------------------------------------------------
      * Reading and writing of volatile variables causes the variable to be read or written to main memory. 
      * Reading from and writing to main memory is more expensive than accessing the CPU cache. 
      * Accessing volatile variables also prevent instruction reordering which is a normal performance enhancement technique. 
      * Thus, you should only use volatile variables when you really need to enforce visibility of variables.
     --------------------------------------------------------------------------------------------------------
 
 */
public class VolatileVariables {

    public static void main(String[] args) {

	SharedObj obj = new SharedObj();
	System.out.println(System.nanoTime() + " : i = " + ++obj.counter + " - " + Thread.currentThread().getName());
	new Thread() {
	    @Override
	    public void run() {
		for (int j = 1; j <= 1000; j++) {
		    try {
			TimeUnit.SECONDS.sleep(0);
		    } catch (Exception e) {
		    }
		    System.out.println(System.nanoTime() + " : i = " + (++obj.counter) + " - " + Thread.currentThread().getName());
		}
	    }
	}.start();

	new Thread() {
	    @Override
	    public void run() {
		for (int j = 1; j <= 1000; j++) {
		    try {
			TimeUnit.SECONDS.sleep(0);
		    } catch (Exception e) {
		    }
		    System.out.println(System.nanoTime() + " : i = " + ++obj.counter + " - " + Thread.currentThread().getName());
		}
	    }
	}.start();
    }
}

class SharedObj {
    public volatile int counter = 0;
}

/*-
	SAMPLE OUTPUT OF VISIBILITY PROBLEM
	
        7498806556203 : i = 1 - main
        7498808549419 : i = 2 - Thread-1
        7498808655805 : i = 3 - Thread-1
        7498808539777 : i = 2 - Thread-0
        7498808790351 : i = 5 - Thread-0
        7498808701882 : i = 4 - Thread-1
        7498808910504 : i = 7 - Thread-1
        7498808843045 : i = 6 - Thread-0
        7498809026415 : i = 9 - Thread-0
        7498808960815 : i = 8 - Thread-1
        7498809076630 : i = 10 - Thread-0
        7498809121445 : i = 11 - Thread-1
        7498809160818 : i = 12 - Thread-0
        7498809195216 : i = 13 - Thread-1
        7498809322095 : i = 15 - Thread-1
        7498809379107 : i = 16 - Thread-1
        7498809426911 : i = 17 - Thread-1
        7498809244627 : i = 14 - Thread-0
        7498809470820 : i = 18 - Thread-1
        7498809507345 : i = 19 - Thread-0
        7498809624189 : i = 21 - Thread-0
        7498809554331 : i = 20 - Thread-1
        7498809686289 : i = 22 - Thread-0
        7498809749468 : i = 23 - Thread-1
        7498809790760 : i = 24 - Thread-0
        7498809836142 : i = 25 - Thread-1
        7498809880202 : i = 26 - Thread-0
        7498809921939 : i = 27 - Thread-1
        7498809964281 : i = 28 - Thread-0
        7498809998282 : i = 29 - Thread-1
        7498810040943 : i = 30 - Thread-0
        7498812926576 : i = 32 - Thread-0
        7498813084027 : i = 33 - Thread-0
        7498813215016 : i = 34 - Thread-0
        7498813344665 : i = 35 - Thread-0
        7498813530867 : i = 36 - Thread-0
        7498813618127 : i = 37 - Thread-0
        7498813671996 : i = 38 - Thread-0
        7498813730199 : i = 39 - Thread-0
        7498813788939 : i = 40 - Thread-0
        7498813848339 : i = 41 - Thread-0
        7498813905539 : i = 42 - Thread-0
        7498813964314 : i = 43 - Thread-0
        7498814038000 : i = 44 - Thread-0
        7498814098846 : i = 45 - Thread-0
        7498814188050 : i = 46 - Thread-0
        7498814234916 : i = 47 - Thread-0
        7498814282897 : i = 48 - Thread-0
        7498814328052 : i = 49 - Thread-0
        7498814373586 : i = 50 - Thread-0
        7498814419729 : i = 51 - Thread-0
        7498814469977 : i = 52 - Thread-0
        7498814513818 : i = 53 - Thread-0
        7498814557534 : i = 54 - Thread-0
        7498814603318 : i = 55 - Thread-0
        7498814655605 : i = 56 - Thread-0
        7498814707769 : i = 57 - Thread-0
        7498814754262 : i = 58 - Thread-0
        7498814800263 : i = 59 - Thread-0
        7498814851788 : i = 60 - Thread-0
        7498814910162 : i = 61 - Thread-0
        7498814964527 : i = 62 - Thread-0
        7498810073810 : i = 31 - Thread-1
        7498815940064 : i = 64 - Thread-1
        7498816061384 : i = 65 - Thread-1
        7498816133438 : i = 66 - Thread-1
        7498816192509 : i = 67 - Thread-1
        7498816244713 : i = 68 - Thread-1
        7498816292409 : i = 69 - Thread-1
        7498816340001 : i = 70 - Thread-1
        7498816381024 : i = 71 - Thread-1
        7498816420707 : i = 72 - Thread-1
        7498816459662 : i = 73 - Thread-1
        7498816498022 : i = 74 - Thread-1
        7498816541626 : i = 75 - Thread-1
        7498816607724 : i = 76 - Thread-1
        7498816668759 : i = 77 - Thread-1
        7498816720371 : i = 78 - Thread-1
        7498816768736 : i = 79 - Thread-1
        7498816816846 : i = 80 - Thread-1
        7498816867552 : i = 81 - Thread-1
        7498816917752 : i = 82 - Thread-1
        7498816967118 : i = 83 - Thread-1
        7498817019630 : i = 84 - Thread-1
        7498817088793 : i = 85 - Thread-1
        7498817144435 : i = 86 - Thread-1
        7498817195033 : i = 87 - Thread-1
        7498817243019 : i = 88 - Thread-1
        7498817287494 : i = 89 - Thread-1
        7498817338020 : i = 90 - Thread-1
        7498817383323 : i = 91 - Thread-1
        7498817437634 : i = 92 - Thread-1
        7498817478249 : i = 93 - Thread-1
        7498817516980 : i = 94 - Thread-1
        7498817556675 : i = 95 - Thread-1
        7498817607199 : i = 96 - Thread-1
        7498817654648 : i = 97 - Thread-1
        7498817699362 : i = 98 - Thread-1
        7498817766178 : i = 99 - Thread-1
        7498817824241 : i = 100 - Thread-1
        7498817878917 : i = 101 - Thread-1
        7498817931098 : i = 102 - Thread-1
        7498817983977 : i = 103 - Thread-1
        7498818036484 : i = 104 - Thread-1
        7498818091089 : i = 105 - Thread-1
        7498818133277 : i = 106 - Thread-1
        7498818183210 : i = 107 - Thread-1
        7498818235690 : i = 108 - Thread-1
        7498818281874 : i = 109 - Thread-1
        7498818328978 : i = 110 - Thread-1
        7498818377122 : i = 111 - Thread-1
        7498818424961 : i = 112 - Thread-1
        7498818473876 : i = 113 - Thread-1
        7498818521756 : i = 114 - Thread-1
        7498818567426 : i = 115 - Thread-1
        7498818622799 : i = 116 - Thread-1
        7498818670441 : i = 117 - Thread-1
        7498818715053 : i = 118 - Thread-1
        7498818754825 : i = 119 - Thread-1
        7498818799335 : i = 120 - Thread-1
        7498818847545 : i = 121 - Thread-1
        7498818947942 : i = 122 - Thread-1
        7498818996392 : i = 123 - Thread-1
        7498819038521 : i = 124 - Thread-1
        7498819073764 : i = 125 - Thread-1
        7498819153667 : i = 126 - Thread-1
        7498819271040 : i = 127 - Thread-1
        7498819404979 : i = 128 - Thread-1
        7498819535745 : i = 129 - Thread-1
        7498819612324 : i = 130 - Thread-1
        7498819692594 : i = 131 - Thread-1
        7498819765463 : i = 132 - Thread-1
        7498819844036 : i = 133 - Thread-1
        7498819926564 : i = 134 - Thread-1
        7498820021086 : i = 135 - Thread-1
        7498815019194 : i = 63 - Thread-0
        7498820169828 : i = 137 - Thread-0
        7498820235422 : i = 138 - Thread-0
        7498820303491 : i = 139 - Thread-0
        7498820369172 : i = 140 - Thread-0
        7498820455493 : i = 141 - Thread-0
        7498820526562 : i = 142 - Thread-0
        7498820594499 : i = 143 - Thread-0
        7498820662778 : i = 144 - Thread-0
        7498820732856 : i = 145 - Thread-0
        7498822666106 : i = 146 - Thread-0
        7498822757562 : i = 147 - Thread-0
        7498822820180 : i = 148 - Thread-0
        7498822889259 : i = 149 - Thread-0
        7498822949009 : i = 150 - Thread-0
        7498823011907 : i = 151 - Thread-0
        7498823069395 : i = 152 - Thread-0
        7498823127118 : i = 153 - Thread-0
        7498823184701 : i = 154 - Thread-0
        7498823240565 : i = 155 - Thread-0
        7498823297124 : i = 156 - Thread-0
        7498823357922 : i = 157 - Thread-0
        7498823411465 : i = 158 - Thread-0
        7498823559788 : i = 159 - Thread-0
        7498823684178 : i = 160 - Thread-0
        7498823823032 : i = 161 - Thread-0
        7498823939054 : i = 162 - Thread-0
        7498824111634 : i = 163 - Thread-0
        7498824203569 : i = 164 - Thread-0
        7498824285387 : i = 165 - Thread-0
        7498824370332 : i = 166 - Thread-0
        7498824449806 : i = 167 - Thread-0
        7498824527201 : i = 168 - Thread-0
        7498824634252 : i = 169 - Thread-0
        7498824719136 : i = 170 - Thread-0
        7498824989322 : i = 171 - Thread-0
        7498825163360 : i = 172 - Thread-0
        7498825294928 : i = 173 - Thread-0
        7498825551290 : i = 174 - Thread-0
        7498825678508 : i = 175 - Thread-0
        7498825795834 : i = 176 - Thread-0
        7498825906715 : i = 177 - Thread-0
        7498826014523 : i = 178 - Thread-0
        7498826126515 : i = 179 - Thread-0
        7498826250116 : i = 180 - Thread-0
        7498826381405 : i = 181 - Thread-0
        7498826506746 : i = 182 - Thread-0
        7498826629606 : i = 183 - Thread-0
        7498826788328 : i = 184 - Thread-0
        7498826910569 : i = 185 - Thread-0
        7498827032552 : i = 186 - Thread-0
        7498827148899 : i = 187 - Thread-0
        7498827287819 : i = 188 - Thread-0
        7498827381054 : i = 189 - Thread-0
        7498827505414 : i = 190 - Thread-0
        7498820090918 : i = 136 - Thread-1
        7498828214187 : i = 191 - Thread-1
        7498828770420 : i = 192 - Thread-1
        7498829049673 : i = 193 - Thread-1
        7498829099078 : i = 194 - Thread-1
        7498829142260 : i = 195 - Thread-1
        7498829182496 : i = 196 - Thread-1
        7498829220019 : i = 197 - Thread-1
        7498829258519 : i = 198 - Thread-1
        7498829295668 : i = 199 - Thread-1
        7498829332529 : i = 200 - Thread-1
	
*/