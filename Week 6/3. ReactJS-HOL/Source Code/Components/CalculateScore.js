import React from 'react';
import '../StyleSheets/myStyle.css'

function CalculateScore(props) {
    const { Name, School, Total, Goal } = props;

    const average = Total / Goal;

    return (
        <div className='score-container'>
            <h2>Student Score Calculator</h2>
            <p><strong>Name:</strong> {Name}</p>
            <p><strong>School:</strong> {School}</p>
            <p><strong>Total Marks:</strong> {Total}</p>
            <p><strong>Goal:</strong> {Goal}</p>
            <h3>Average Score: {average.toFixed(2)}</h3>
        </div>
    )
}

export default CalculateScore;
