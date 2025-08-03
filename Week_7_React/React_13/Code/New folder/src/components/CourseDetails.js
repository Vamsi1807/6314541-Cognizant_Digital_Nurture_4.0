import React from 'react';

function CourseDetails({ course }) {
  return (
    <div>
      <h2>Course Details</h2>
      {course && (
        <>
          <p><b>Title</b> : {course.title}</p>
          <p><b>Instructor</b> : {course.instructor}</p>
          <p><b>Duration</b> : {course.duration}</p>
        </>
      )}
      {!course && <div>No course selected</div>}
    </div>
  );
}

export default CourseDetails;