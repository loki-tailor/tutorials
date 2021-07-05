package com.logics.t2;

import com.logics.t1._54.main.main;

public class _3_Test extends StringInstrument implements MusicCreator {
    public static void main(String[] args) {

    }

    // return type is incompatiable with StringInstrument.play
    // public Integer play() { return 12; }

    public Long play() {
        return 12L;
    }
}

interface MusicCreator {
    public Number play();
}

abstract class StringInstrument {
    public Long play() {
        return 3L;
    }
}
