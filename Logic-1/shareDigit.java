public boolean shareDigit(int a, int b) {
  int fd1 = a / 10, sd1 = a % 10;
  int fd2 = b / 10, sd2 = b % 10;
  if(fd1 == fd2 || fd1 == sd2 || sd1 == fd2 || sd1 == sd2) return true;
  return false;
}
