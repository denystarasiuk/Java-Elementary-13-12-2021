package com.stonescissorspaper.service;

public enum Move {

        STONE("stone"),
        SCISSORS("scissors"),
        PAPER("paper");

        private String value;

        Move(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

}
