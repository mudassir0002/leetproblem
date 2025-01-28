/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    const length = arr.length;
    const newArr = new Array();

    for (let i = 0; i < length; i++) {
        newArr[i] = fn(arr[i], i);
    };

    return newArr;
};