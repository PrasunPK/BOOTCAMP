var fs = require('fs');
var _ = require('lodash');
var Chance = require('chance');
var chance = new Chance();

var writeNames = function(){
  var i = 0 ;
  var names = []; 
  while(i < 50000){
    var name = chance.first();
    if(_.unique(names,name)){
      names.push(name);
      fs.appendFileSync('name.txt',name+'\n');
    };
    i++;
  };
  console.log('Value of i : ',i , names.length);
};

writeNames();
