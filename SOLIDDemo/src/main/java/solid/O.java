package solid;

public class O {
    /**
    The Open/Closed Java Principle

     The definition: Software entities should be open for extension, but closed for modification.

     Open for extension - As the requirements of the application change, we are able to extend the module with new
     behaviors that satisfy those changes. In other words, we are able to change what the module does.

     What does this mean - This simply means that a class should be easily extendable without modifying the class itself.

     // look at the AreaCalculator class, especially its sum method in the example.
     Example:

     AreaCalculator.prototype.sum = function(){
     var areasArray = this.shapes.map(function(shape){
     //Normally we would use if/else logic but we could
        if (shape instanceof Square) {
        return Math.pow(shape.length, 2);
     }
     else if (shape instanceof Square) {
        return Math.PI * Math.pow(shape.radius, 2);
        }
     });
     return areasArray.reduce(function(acc, cur){
        return acc + cur;
        });
     };

    // Would be better if we attached the area logic to each individual class

     Refactored Example:

     Square.prototype.area = function(){
        return Math.pow(this.length, 2);
     };
     Circle.prototype.area = function(){
        return Math.pow(this.radius, 2);
     };
     AreaCalculator.prototype.sum = function(){
      var areasArray = this.shapes.map(function(shape){
        return shape.area();
     });
     return areasArray.reduce(function(acc, cur) {
        return acc + cur;
        });
     };

     // Since we used the open/closed principle we can now apply the area method to any shape and pass it into the
     area calculator, as long as it follows the shape interface and has the expected method.
     // This allows us to apply methods to classes much easier than making if/else statements to check to see if
     the conditions match or not.
     // This also allows us to add a new shape and extend the use of the areaCalculator without having to change
     any of the code.





     */
}
