a = {};
console.log(a.__proto__);
// {}

b = {y: 10};
console.log(a.__proto__ === b.__proto__);
// true

console.log(a.__proto__ === b.__proto__);
// true

proto = a.__proto__
console.log(proto);
// {}
proto.z = -1
// -1
console.log(proto);
// { z: -1 }

console.log(a.z);
// -1
console.log(b.z);
// -1