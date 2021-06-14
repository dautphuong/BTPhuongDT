let result = document.getElementById('result');
let topic = document.getElementById('topic');
var users = [
    { id: 1, first_name: "Eamon", last_name: "Harhoff", email: "eharhoff0@imageshack.us", gender: "Male", age: 76, salary: 18888 },
    { id: 2, first_name: "Laney", last_name: "Whittam", email: "lwhittam1@issuu.com", gender: "Female", age: 42, salary: 15018 },
    { id: 3, first_name: "Lynett", last_name: "Twinberrow", email: "ltwinberrow2@gov.uk", gender: "Female", age: 99, salary: 13343 },
    { id: 4, first_name: "Hana", last_name: "Gaw", email: "Habc@gov.uk", gender: "Male", age: 33, salary: 1332343 }

];

function FilterUser() {
    topic.innerText = 'Sử dụng hàm filter để lọc và hiển thị các user có gender là male và age dưới 40'
    let arr = users.filter(user => user.gender == "Male" && user.age < 40)
    let print = '';
    arr.forEach(value => print += '{ id: ' + value.id + ', first_name: ' + value.first_name +
        ', last_name: ' + value.last_name + ', email: ' + value.email +
        ', gender: ' + value.gender + ', age: ' + value.age + ', salary: ' + value.salary + '}\n');
    result.innerText = print
}

function FunAvg() {
    topic.innerText = 'Sử dụng hàm reduce để tính trung bình chung độ tuổi của các user'
    let numAvg = users.reduce((avg, value) => {
        return avg + value.age
    }, 0) / users.length
    result.innerText = 'trung bình : ' + numAvg
}