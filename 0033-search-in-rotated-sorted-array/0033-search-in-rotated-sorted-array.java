class Solution {

  int findPivot(int[] nums) {
    int start = 0, end = nums.length - 1;
    while (start <= end) {
      int middle = start + (end - start) / 2;
      if (middle < end && nums[middle] > nums[middle + 1]) {
        return middle;
      } else if (start < middle && nums[middle] < nums[middle - 1]) {
        return middle - 1;
      } else if (nums[middle] <= nums[start]) {
        end = middle - 1;
      } else {
        start = middle + 1;
      }
    }
    return -1;
  }

  int Bsearch(int[] arr, int k, int start, int end) {

    while (start <= end) {
      int middle = (start + end) / 2;
      if (arr[middle] > k) {
        end = middle - 1;
      } else if (arr[middle] < k) {
        start = middle + 1;
      } else if (arr[middle] == k) {
        return middle;
      }
    }
    return -1;
  }

  int search(int[] nums, int target) {
    int pivot = findPivot(nums);
    if (pivot == -1) {
      return Bsearch(nums, target, 0, nums.length - 1);
    } else if (nums[pivot] == target) {
      return pivot;
    } else if (target >= nums[0]) {
      return Bsearch(nums, target, 0, pivot - 1);
    }
    return Bsearch(nums, target, pivot + 1, nums.length - 1);
  }
}