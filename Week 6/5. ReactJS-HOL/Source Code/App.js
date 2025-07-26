import React from 'react';
import './App.css';
import CohortDetails from './CohortDetails';

function App() {
    return (
        <div className="App">
            <CohortDetails
                name="React Bootcamp"
                status="ongoing"
                startDate="01-07-2025"
                endDate="31-07-2025"
            />
            <CohortDetails
                name="Angular Masterclass"
                status="completed"
                startDate="01-05-2025"
                endDate="31-05-2025"
            />
        </div>
    );
}

export default App;
