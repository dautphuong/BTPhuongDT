let result = document.getElementById('result');
let topic = document.getElementById('topic');

function validatorCredit() {
    topic.innerText = 'Kiểm tra số credit card – chuỗi chỉ chứa giá trị số có độ dài 16 số';
    let value = document.getElementById('credit').value
    let patt = /^[0-9]{16}$/;
    result.innerText = patt.test(value);
}

function checkNum() {
    topic.innerText = 'Kiểm tra một giá trị có phải là số hay không?';
    let value = document.getElementById('num').value
    let patt = /^[0-9]+$/;
    result.innerText = patt.test(value);
}

function validatorEmail() {
    topic.innerText = 'Kiểm tra một chuỗi có thỏa mãn định dạng email hay không?';
    let value = document.getElementById('email').value
    let patt = /^[A-Za-z0-9]+@[A-Za-z0-9]+(\.[A-Za-z0-9]+)(\.[A-Za-z0-9]+)*$/;
    result.innerText = patt.test(value);

}

function checkUrl() {
    topic.innerText = 'Kiểm tra một chuỗi có phải là chuỗi theo cú pháp url web hay không?';
    let value = document.getElementById('url').value
    let patt = /^(http:\/\/www\.|https:\/\/www\.|www\.|http:\/\/|https:\/\/)?[a-z0-9]+(\.{1}[a-z0-9]+)*\.[a-z]{2,5}(\/)?$/
    result.innerText = patt.test(value);
}

function checkNonSpecial() {
    topic.innerText = 'Chỉ chứa ký tự alphabet và số, không chứa các ký tự đặc biệt.?';
    let value = document.getElementById('string').value
    let patt = /^[A-Za-z0-9]+$/;
    result.innerText = patt.test(value);

}