/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int* minOperations(char* boxes, int* returnSize) {
    int n = strlen(boxes);
    int* answer = (int*)malloc(n * sizeof(int));

    for (int i = 0; i < n; ++i) {
        int count = 0;
        for (int j = 0; j < n; ++j) {
            if (boxes[j] == '1') {
                count += abs(i - j);
            }
        }
        answer[i] = count;
    }

    *returnSize = n;
    return answer;
}

