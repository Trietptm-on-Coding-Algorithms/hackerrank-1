# https://www.hackerrank.com/challenges/bash-tutorials---looping-and-skipping

a=$(expr 1)
b=$(expr 99)
until [ $a -gt $b ]
do
echo $a
a=$(expr $a + 2)
done
