let result = document.getElementById('result');
let topic = document.getElementById('topic');

var arr = [3, 8, 1, 4, 6, 5, 7, 2]

function EvenNumber() {
    topic.innerText = 'Viết hàm hiển thị danh sách các giá trị chẵn trong mảng và tổng các giá trị chẵn trong mảng'
    var arrEvenNumber = arr.filter(value => value % 2 == 0)
    result.innerText = 'Mang so chan : ' + arrEvenNumber +
        '\nSum : ' + arrEvenNumber.reduce((a, b) => a + b, 0);

}

function OddNumber() {
    topic.innerText = 'Viết hàm hiển thị danh sách các giá trị lẽ trong mảng và tổng các giá trị lẽ trong mảng'
    var arrOddNumber = arr.filter(value => value % 2 != 0)
    result.innerText = 'Mang so le : ' + arrOddNumber +
        '\nSum : ' + arrOddNumber.reduce((a, b) => a + b, 0);
}

function newArray() {
    topic.innerText = 'Viết hàm hiển thị danh sách các giá trị trong mảng ban đầu có giá trị nằm trong khoảng[a, b].Trong đó, a và b nhập vào từ bàn phím và a≥ b.'
    let a = prompt('Nhap vi tri a') * 1;
    let b = prompt('Nhap vi tri b') * 1;
    result.innerText = arr.slice(a, b + 1)
}


//Viết hàm sắp xếp các giá trị trong mảng chứa các giá trị chẵn,
// mảng chứa các giá trị lẽ và mảng ban đầu theo thứ tự tăng dần. 
//(Viết hàm sắp xếp theo các thuật toán (ít nhất 2 thuật toán): 
//Selection sort, Insertion sort, Merge sort, Quick sort, Stooge Sort)
function selectionSort() {
    topic.innerText = 'Viết hàm sắp xếp theo thuật toán Selection sort'
    let inputArr = arr;

    for (let i = 0; i < inputArr.length; i++) {
        let min = i;
        for (let j = i + 1; j < inputArr.length; j++) {
            if (inputArr[j] < inputArr[min]) {
                min = j;
            }
        }
        if (min != i) {
            let tmp = inputArr[i];
            inputArr[i] = inputArr[min];
            inputArr[min] = tmp;
        }
    }
    result.innerText = inputArr
}


function merge(left, right) {
    let sorted = [];

    while (left.length && right.length) {
        if (left[0] < right[0]) sorted.push(left.shift());
        else sorted.push(right.shift());
    };

    return sorted.concat(left.slice().concat(right.slice()));
}

function runMerge() {
    topic.innerText = 'Viết hàm sắp xếp theo thuật toán Merge sort'

    result.innerText = MergeSort(arr)

}

function MergeSort(array) {
    if (array.length < 2) return array;
    let mid = Math.floor(array.length / 2),
        left = MergeSort(array.slice(0, mid)),
        right = MergeSort(array.slice(mid));

    return merge(left, right);
}