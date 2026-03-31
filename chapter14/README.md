README For: Lab/HW 3 - Geospatial Track Data Analyzer

1. The two problems you defined.

How can I sort ride data points to find the top 10 fastest segments (by speed) that also occurred at the highest altitudes, and how did a high speed affect heartrate?

Given a specific target range of elevations (e.g., 100m - 120m), how can I efficiently find all timestamps where the rider was within this elevation range and what was the average speed within that range

2. A brief justification for the sorting and searching algorithms you chose, including their time and space complexity.

I used a merge sorting algorithm. It has a time complexity of O(n log n) and a space complexity of O(n). I used this because it is very effecient and scales well for larger data sets such as this one. The quick speed makes up for the extra memory used to merge. 

Additionally, I used a binary searching algorithm. It has a time complexity of O(log n) and a space complexity of O(log n); excluding the fact that if the target element was the middle element the formula would be O(1) for both. I used this searching algorithm because it repeatedly cuts the data set in half making it very effecient, especially for larger data sets. Moreover, the space complexity is also effecient despite using recursion. 

3. The final output/results of your analysis (e.g., the actual top 10 elevation points found).

Data sorted by top 10 speeds:
BikeDataRecord [timestamp=1142088661, distance=184635.02, heartrate=131, speed=17.915, alt=10.6, lat=38.70938, lng=-76.65218, pow=0.0, cad=0.0, degC=23.0]
BikeDataRecord [timestamp=1142088660, distance=184616.86, heartrate=131, speed=17.803, alt=11.8, lat=38.70949, lng=-76.65234, pow=0.0, cad=0.0, degC=23.0]
BikeDataRecord [timestamp=1142081228, distance=141211.52, heartrate=106, speed=17.719, alt=52.6, lat=38.80569, lng=-76.96192, pow=0.0, cad=0.0, degC=16.0]
BikeDataRecord [timestamp=1142088659, distance=184599.02, heartrate=129, speed=17.719, alt=13.2, lat=38.7096, lng=-76.65249, pow=0.0, cad=0.0, degC=23.0]
BikeDataRecord [timestamp=1142081226, distance=141175.97, heartrate=107, speed=17.691, alt=56.0, lat=38.80574, lng=-76.96233, pow=0.0, cad=0.0, degC=16.0]
BikeDataRecord [timestamp=1142081227, distance=141193.66, heartrate=107, speed=17.691, alt=54.2, lat=38.80572, lng=-76.96213, pow=0.0, cad=0.0, degC=16.0]
BikeDataRecord [timestamp=1142081229, distance=141229.6, heartrate=106, speed=17.579, alt=51.2, lat=38.80566, lng=-76.96172, pow=0.0, cad=0.0, degC=16.0]
BikeDataRecord [timestamp=1142088662, distance=184652.48, heartrate=135, speed=17.467, alt=9.2, lat=38.70928, lng=-76.65203, pow=0.0, cad=0.0, degC=23.0]
BikeDataRecord [timestamp=1142081225, distance=141158.16, heartrate=107, speed=17.364, alt=57.6, lat=38.80575, lng=-76.96253, pow=0.0, cad=0.0, degC=16.0]
BikeDataRecord [timestamp=1142081230, distance=141247.38, heartrate=105, speed=17.364, alt=49.6, lat=38.80563, lng=-76.96152, pow=0.0, cad=0.0, degC=16.0]

Temperatures were stable from 60 - 75
Average Heart Rate: 104.27156971734462
Average Heart Rate for Top 10 Speeds: 116.4

This tells us that heart rate increases when the rider is going faster

5547 records within an altitude of 100m - 120m
Average speed: 6.120698 within that altitude
