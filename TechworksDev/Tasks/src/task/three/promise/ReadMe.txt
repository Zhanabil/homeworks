Задание 1
	SELECT 
   		p.id,
   		p.name AS PASSENGER_NAME,
   		t.plane,
   		c.name
	FROM Passenger AS p
	JOIN Pass_in_trip AS pit
	ON p.id = pit.passenger
	JOIN Trip AS t
	ON t.id = pit.trip
	JOIN Company AS c
	ON c.id = t.company
	WHERE t.plane = 'Boeing' AND c.name = 'air_France' 







Задание 2
	SELECT DISTINCT 
    		pit.passenger,
    		t.id
	FROM Pass_in_trip AS pit
	JOIN Trip AS t
	ON pit.trip = t.id
	JOIN Passenger AS p
	ON p.id = pit.passenger



Задание 3

	-Результат не верен, но я все равно решил добавить свой ответ

	SELECT COUNT(*)
	FROM Passenger AS p
	JOIN Passenger AS p2
	ON p.id = p2.id
	WHERE  p.name LIKE '[a-z]%' = p2.name LIKE '[a-z]%'


