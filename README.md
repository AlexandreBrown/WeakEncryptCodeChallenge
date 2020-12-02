# WeakEncryptCodeChallenge
My solution to a code challenge sent on Kotlin Ktor group https://www.facebook.com/groups/kotlinktor/permalink/3836560726395477/

Problem :
1.User should be able to enter the text
2.Find odd numbered words(eg. *Hai How are you?* ,where odd numbered words are Hai,are)
3.Select even numbered character from the selected words
3.Pswd length should be greater or equal to total word count(eg.Hi How are you?,word count=4 and pswd length should be >=4)Add * to make the word count  equal to pswd length.(if word count=5,and pswd length=2 then add 3 '*')(if pswd =st and word length is 5,final pswd must be st***)
4.include single quote ' ' before and after the pswd for better understanding
5.Character count must start from 1 not from 0(H-1,a-2,i-3..vice versa)

Eg.input text:Hai. How aRe you?
Output:'a.R*'

Input text:Hellooooo. How r you?
Output:'eloo.'
