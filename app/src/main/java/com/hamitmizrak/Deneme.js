// Class
class Person {
    constructor(adi="HamitM.",soyadi="Mızrak"){
        this.adi=adi;
        this.soyadi=soyadi;
        console.log("constructor method");
        console.log(this);
    }

    message(){
        return `${this.adi} - ${this.soyadi}`;
    }
} //end class

let dataPerson1=new Person();
console.log(`Merhabalar-1: ${dataPerson1.message()}`);

let dataPerson2=new Person("isim44","soyisim44");
console.log(`Merhabalar-2: ${dataPerson2.message()}`);

// extends
class Hamit extends Person{
}

let dataPerson3=new Hamit("Hamit","Mızrak");
console.log(`Merhabalar-3: ${dataPerson3.message()}`);