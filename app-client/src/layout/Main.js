import {
    Switch,
    Route
  } from "react-router-dom";

export default function Main () {

    return (
        <Switch>
            <Route exact path="/explore" component={}/>
            <Route exact path="/account" component={}/>
            <Route exact path="/" component={}/>
        </Switch>
    );

}