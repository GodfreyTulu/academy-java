/*
CREATE [OR REPLACE] FUNCTION function_name (parameters) 
RETURNS return_datatype AS $variable_name$
   DECLARE
      variable_declaration(s);
[...]
   BEGIN
      function_body
      [...]
   RETURN { variable_name | value }
   END; 
LANGUAGE plpgsql;
*/

-- Example 1: create a Function to add two numbers and return the result

create OR REPLACE FUNCTION "addNumbers" (num1 integer, num2 integer) returns integer as 

$$
begin

return num1 + num2;

end;

$$
language plpgsql;

-- Execute the Function

select "addNumbers"(2,3) as "SUM";



-- Example 2: Total Records in students Table
CREATE OR REPLACE FUNCTION totalRecordsInStudents() RETURNS INTEGER AS $total$
DECLARE
    total INTEGER;
BEGIN
   SELECT COUNT(*) INTO total FROM "students";
   RETURN total;
END;
$total$ 
LANGUAGE plpgsql;

-- To call this function and check the total records in the students table, run this statement:
SELECT totalRecordsInStudents();


-- Example 3: Create a Function to return the maximum courseId from courses Table

CREATE OR REPLACE function "getMaxCourseId"() returns integer as
$$
DECLARE
	maxCourseId integer;
BEGIN
	 SELECT max("courseId") INTO maxCourseId FROM "courses";
	 return maxCourseId;
END;
$$
LANGUAGE plpgsql;


-- Execute the Function
select "getMaxCourseId"();


-- Example 4: Create a Function to return the rows based on a courseId
CREATE OR REPLACE function "getCoursesByCourseId"(_courseId integer) 
returns table("courseId" integer, "courseName" varchar) as
$$	
BEGIN

	return query SELECT * from "courses" where "courses"."courseId" = _courseId;

END;
$$
LANGUAGE plpgsql;

-- Execute the Function
select * from "getCoursesByCourseId"(4); 













