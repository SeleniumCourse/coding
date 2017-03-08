package com.jalasoft.selenium.daniel.jauregui.movies;

abstract class aMovie implements iMovie {
    private String _title;
    private int _bonus;
    
    public aMovie(String _title, int bonus) {
        this._title = _title;
        this._bonus = bonus;
    }
    public int getBonus() {
        return _bonus;
    }

    public void setBonus(int bonus) {
        this._bonus = bonus;
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String _title) {
        this._title = _title;
    }
    
    public int calculateBonus(int rentedDays){
        if (( this._bonus != 0) && rentedDays > 1) return (this._bonus + 1);
        return 1;
    }
}
