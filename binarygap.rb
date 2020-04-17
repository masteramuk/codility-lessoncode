def solution(n)
  collection_of_zero = []
  collection_of_zero = n.to_s(2)[0, n.to_s(2).rindex('1')].split("1")
  x= 0
  a = 0
  while x < collection_of_zero.length
    a = a > collection_of_zero[x].length ? a : collection_of_zero[x].length
    x += 1
  end
  a
end
