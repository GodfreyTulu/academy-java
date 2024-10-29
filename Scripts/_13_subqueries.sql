-- Get all the students for the course Web Development
SELECT "courseId", "studentId", "studentName", "studentEmail", "studentPhone" FROM students
WHERE "courseId" =
    (SELECT "courseId" 
     FROM courses 
     WHERE "courseName" = 'Web Development Fundamentals');
     
 
 -- Get all the students for the course that was added last to the courses
SELECT "courseId", "studentId", "studentName", "studentEmail", "studentPhone" FROM "students" WHERE "courseId" = 
(SELECT MIN("courseId") FROM "courses");


-- Update the phone number for all the students for the course Web Development

UPDATE students
SET "studentPhone" = 8675309
WHERE "courseId" =
    (SELECT "courseId" 
     FROM courses 
     WHERE "courseName" = 'Web Development Fundamentals');