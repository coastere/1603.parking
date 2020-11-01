package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
class ParkingSystem {
    int nbig;
    int nmedium;
    int nsmall;

    public ParkingSystem(int big, int medium, int small) {
        nbig=big;
        nmedium=medium;
        nsmall=small;

    }

    public boolean addCar(int carType) {
        if(carType==1) {
            if(nbig>0){
                nbig=nbig-1;
                return true;
            }else return false;
        }
        else if(carType==2){
            if(nmedium>0){
                nmedium=nmedium-1;
                return true;
            }else return false;
        } else if(carType==3){
            if(nsmall>0){
                nsmall=nsmall-1;
                return true;
            }else return false;
        }else return false;


    }
}